package com.yangxiaochen.audit.core.aspect;

import com.yangxiaochen.audit.core.AuditContentProvider;
import com.yangxiaochen.audit.core.AuditService;
import com.yangxiaochen.audit.core.RequestIdStore;
import com.yangxiaochen.audit.core.UserInfoProvider;
import com.yangxiaochen.audit.core.annotation.Audit;
import com.yangxiaochen.audit.core.model.UserInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;


@Aspect
@Component
public class AuditAspect {

    @Resource
    private AuditService auditService;

    @Resource
    private RequestIdStore requestIdStore;

    @Resource
    private UserInfoProvider userInfoProvider;
    @Resource
    private AuditContentProvider auditContentProvider;

    @Around("@annotation(audit)")
    public Object auditMethod(ProceedingJoinPoint joinPoint, Audit audit) throws Throwable {
        String requestId = requestIdStore.generateRequestId();
        UserInfo userInfo = userInfoProvider.getUserInfo();
        String endPointName = joinPoint.getSignature().toLongString();
        String tag = audit.tag();


        if (audit.recordInput()) {
            // 获取基础的入参内容
            String inputContent = auditContentProvider.provideContent("input", joinPoint.getArgs(), null);
            // 记录基础的入参
            auditService.audit(requestId, endPointName, "input", userInfo.getUserId(), userInfo.getUsername(), userInfo.getUserDetails(), inputContent);
        }

        Object result;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            if (audit.recordException()) {
                // 获取异常内容
                String exceptionContent = auditContentProvider.provideContent("exception", joinPoint.getArgs(), null);
                // 记录方法执行异常的审计信息
                auditService.audit(requestId, endPointName, "exception", userInfo.getUserId(), userInfo.getUsername(), userInfo.getUserDetails(), exceptionContent);
            }
            throw throwable;
        }

        if (audit.recordOutput()) {
            // 获取基础的出参内容
            String outputContent = auditContentProvider.provideContent("output", joinPoint.getArgs(), result);
            // 记录基础的出参
            auditService.audit(requestId, endPointName, "output", userInfo.getUserId(), userInfo.getUsername(), userInfo.getUserDetails(), outputContent);
        }

        // 如果用户设置了自定义的 tag
        if (tag != null && !tag.isEmpty()) {
            String customContent = auditContentProvider.provideContent(tag, joinPoint.getArgs(), result);
            // 记录自定义的content
            auditService.audit(requestId, endPointName, tag, userInfo.getUserId(), userInfo.getUsername(), userInfo.getUserDetails(), customContent);
        }

        return result;
    }
}

