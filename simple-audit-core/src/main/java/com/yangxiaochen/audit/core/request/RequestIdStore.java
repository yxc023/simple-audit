package com.yangxiaochen.audit.core;

public interface RequestIdStore {
    String generateRequestId();
    String getRequestId();
    void setRequestId(String requestId);
}
