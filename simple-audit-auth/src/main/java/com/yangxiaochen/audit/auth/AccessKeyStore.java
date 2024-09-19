package com.yangxiaochen.audit.auth;

public interface AccessKeyStore {
    String saveAccessKey(String accessKey, AccessInfo accessInfo);

    AccessInfo getAccessInfo(String accessKey);
}
