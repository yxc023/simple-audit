package com.yangxiaochen.audit.spring;

/**
 * 审计内容自定义
 */
public interface AuditContentProvider {
    String provideContent(String tag, Object[] args, Object result);
}
