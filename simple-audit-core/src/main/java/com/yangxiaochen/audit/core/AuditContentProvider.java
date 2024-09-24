package com.yangxiaochen.audit.core;

/**
 * 审计内容自定义
 */
public interface AuditContentProvider {
    String provideContent(String tag, Object[] args, Object result);
}
