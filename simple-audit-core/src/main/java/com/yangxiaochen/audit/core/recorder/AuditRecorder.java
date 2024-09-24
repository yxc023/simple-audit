package com.yangxiaochen.audit.core.recorder;

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
