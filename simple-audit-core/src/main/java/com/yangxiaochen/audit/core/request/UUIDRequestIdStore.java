package com.yangxiaochen.audit.core.request;

import java.util.UUID;

public class UUIDRequestIdStore implements RequestIdStore{
    ThreadLocal<String> requestId = new InheritableThreadLocal<>();
    @Override
    public String generateRequestId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String getRequestId() {
        return requestId.get();
    }

    @Override
    public void setRequestId(String requestId) {
        this.requestId.set(requestId);
    }

    public void removeRequestId() {
        requestId.remove();
    }
}
