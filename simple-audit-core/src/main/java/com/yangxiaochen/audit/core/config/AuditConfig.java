package com.yangxiaochen.audit.core.config;

import com.yangxiaochen.audit.core.AuditRecorder;
import com.yangxiaochen.audit.core.RequestIdStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditConfig {

    private final AuditRecorder auditRecorder;
    private final RequestIdStore requestIdStore;

    public AuditConfig(AuditRecorder auditRecorder, RequestIdStore requestIdStore) {
        this.auditRecorder = auditRecorder;
        this.requestIdStore = requestIdStore;
    }

    public AuditRecorder getAuditRecorder() {
        return auditRecorder;
    }

    public RequestIdStore getRequestIdStore() {
        return requestIdStore;
    }
}
