package com.yangxiaochen.audit.core.impl;

import com.yangxiaochen.audit.core.RequestIdStore;

import java.util.UUID;

public class DefaultRequestIdStore implements RequestIdStore {

    private ThreadLocal<String> requestIdStore = new ThreadLocal<>();

    @Override
    public String generateRequestId() {
        String requestId = UUID.randomUUID().toString();
        requestIdStore.set(requestId);
        return requestId;
    }

    @Override
    public String getRequestId() {
        return requestIdStore.get();
    }

    @Override
    public void setRequestId(String requestId) {
        requestIdStore.set(requestId);
    }
}
