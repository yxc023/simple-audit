package com.yangxiaochen.audit.spring;

import com.yangxiaochen.audit.core.*;
import com.yangxiaochen.audit.core.config.AuditConfig;
import com.yangxiaochen.audit.core.impl.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public RequestIdStore requestIdStore() {
        return new DefaultRequestIdStore();
    }

    @Bean
    @ConditionalOnMissingBean
    public AuditRecorder auditRecorder() {
        return new DefaultAuditRecorder();
    }

    @Bean
    @ConditionalOnMissingBean
    public UserInfoProvider userInfoProvider() {
        return new DefaultUserInfoProvider();
    }

    @Bean
    @ConditionalOnMissingBean
    public AuditContentProvider auditContentProvider() {
        return new DefaultAuditContentProvider();
    }

    @Bean
    @ConditionalOnMissingBean
    public AuditConfig auditConfig(AuditRecorder auditRecorder, RequestIdStore requestIdStore) {
        return new AuditConfig(auditRecorder, requestIdStore);
    }

    @Bean
    @ConditionalOnMissingBean
    public AuditService auditService(AuditConfig auditConfig) {
        return new DefaultAuditService(auditConfig);
    }
}
