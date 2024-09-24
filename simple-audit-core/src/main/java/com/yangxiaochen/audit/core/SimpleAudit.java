package com.yangxiaochen.audit.core;

import com.yangxiaochen.audit.core.recorder.AuditRecord;

public class SimpleAudit {

    private SimpleAuditConfig simpleAuditConfig;

    public SimpleAudit(SimpleAuditConfig simpleAuditConfig) {
        this.simpleAuditConfig = simpleAuditConfig;
    }

    /**
     * audit.audit(
     *     String requestId, // 请求id，一次请求中可以记录多个 audit
     *     String endPointName, // 请求的端口标识，可以是 url，或者接口签名
     *     String tag, // audit 记录的目的，可以是 input，output，changes，msg等，自定义，用来决定 content 的内容
     *     String userid, // 用户标识
     *     String username, // 用户呈现名称
     *     String userDetails, // 用户更多的描述，可以是 组织，职位 等
     *     String content // 审计的更多信息，自定义。可以是 输入、输出、变更前的对象，变更后的对象，或者仅仅是一段变更记录等。
     *     )
     */
    public void audit(String requestId, String endPointName, String tag, String userid, String username, String userDetails, String content) {
        // do audit
        simpleAuditConfig.getAuditRecorder().saveRecord(new AuditRecord(requestId, endPointName, tag, userid, username, userDetails, content));
    }


    public void audit(String endPointName, String tag, String userid, String username, String userDetails, String content) {
        // do audit
        String requestId = simpleAuditConfig.getRequestIdStore().getRequestId();
        simpleAuditConfig.getAuditRecorder().saveRecord(new AuditRecord(requestId, endPointName, tag, userid, username, userDetails, content));
    }
}
