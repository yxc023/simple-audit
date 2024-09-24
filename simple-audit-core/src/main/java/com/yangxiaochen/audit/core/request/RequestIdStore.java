package com.yangxiaochen.audit.core.request;

public interface RequestIdStore {
    String generateRequestId();
    String getRequestId();
    void setRequestId(String requestId);
}
