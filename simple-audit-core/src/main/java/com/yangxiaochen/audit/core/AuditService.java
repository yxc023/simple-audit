package com.yangxiaochen.audit.core;

/**
 * 审计服务接口
 */
public interface AuditService {
    void audit(String requestId, String endPointName, String tag, String userId, String username, String userDetails, String content);
}
