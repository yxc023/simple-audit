package com.yangxiaochen.audit.core;

import com.yangxiaochen.audit.core.recorder.AuditRecorder;
import com.yangxiaochen.audit.core.request.RequestIdStore;

public class SimpleAuditConfig {

    private AuditRecorder auditRecorder;

    private RequestIdStore requestIdStore;

    public SimpleAuditConfig(AuditRecorder auditRecorder, RequestIdStore requestIdStore) {
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
