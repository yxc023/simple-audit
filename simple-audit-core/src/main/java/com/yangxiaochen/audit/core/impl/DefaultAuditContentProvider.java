package com.yangxiaochen.audit.core.impl;

import com.yangxiaochen.audit.core.AuditContentProvider;
import com.yangxiaochen.audit.core.ContentGenerator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DefaultAuditContentProvider implements AuditContentProvider {
    private static final Map<String, ContentGenerator> defaultGenerators = new HashMap<>();

    static {
        defaultGenerators.put("input", (args, result) -> "Input arguments: " + Arrays.toString(args));
        defaultGenerators.put("output", (args, result) -> "Output result: " + (result != null ? result.toString() : "null"));
        defaultGenerators.put("exception", (args, result) -> "Exception occurred");
    }

    @Override
    public String provideContent(String tag, Object[] args, Object result) {
        ContentGenerator generator = defaultGenerators.get(tag);
        if (generator != null) {
            return generator.generateContent(args, result);
        } else {
            throw new IllegalArgumentException("Unknown tag: " + tag + ". Please provide a custom implementation for this tag.");
        }
    }
}
