package com.yangxiaochen.audit.core;

import com.yangxiaochen.audit.core.recorder.AuditRecorder;
import com.yangxiaochen.audit.core.request.RequestIdProvider;

public class SimpleAuditConfig {

    private AuditRecorder auditRecorder;

    private RequestIdProvider requestIdStore;

    public SimpleAuditConfig(AuditRecorder auditRecorder, RequestIdProvider requestIdStore) {
        this.auditRecorder = auditRecorder;
        this.requestIdStore = requestIdStore;
    }

    public AuditRecorder getAuditRecorder() {
        return auditRecorder;
    }

    public RequestIdProvider getRequestIdStore() {
        return requestIdStore;
    }
}
