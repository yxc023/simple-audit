package com.yangxiaochen.audit.core.recorder;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Data
@Slf4j
public class MysqlAuditRecorder implements AuditRecorder {
    @Override
    public void saveRecord(AuditRecord record) {
        // save to mysql
        log.info("save to mysql: {}", record);
    }
}
