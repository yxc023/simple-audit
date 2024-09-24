package com.yangxiaochen.audit.spring;

public interface ContentGenerator {
    String generateContent(Object[] args, Object result);
}
