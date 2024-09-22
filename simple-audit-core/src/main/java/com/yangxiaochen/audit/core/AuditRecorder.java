package com.yangxiaochen.audit.core;

import com.yangxiaochen.audit.core.model.AuditRecord;

/**
 * 审计记录接口
 */
public interface AuditRecorder {
    /**
     * 保存审计记录
     * @param record
     */
    void saveRecord(AuditRecord record);

}
