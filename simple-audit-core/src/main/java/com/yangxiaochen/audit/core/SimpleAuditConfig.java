package com.yangxiaochen.audit.core;

public class AuditConfig {

    private AuditRecorder auditRecorder;

    private RequestIdStore requestIdStore;

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
