package com.yangxiaochen.audit.core.request;


/**
 * request id generator
 * save and get request id in current context
 */
public interface RequestIdProvider {
    String generateRequestId();

    String getRequestId();

    void setRequestId(String requestId);

    void removeRequestId();
}
