package com.yangxiaochen.audit.core.impl;


import com.yangxiaochen.audit.core.recorder.AuditRecord;
import com.yangxiaochen.audit.core.recorder.AuditRecorder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultAuditRecorder implements AuditRecorder {
    @Override
    public void saveRecord(AuditRecord record) {
        System.out.println("default save record: " + record.toString());
    }
}
