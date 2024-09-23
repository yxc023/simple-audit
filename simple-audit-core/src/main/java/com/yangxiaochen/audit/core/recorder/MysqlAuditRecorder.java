package com.yangxiaochen.audit.core.recorder;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MysqlAuditRecorder implements AuditRecorder {
    @Override
    public void record(AuditRecord record) {
        // save to mysql

        log.info("save to mysql: {}", record);

    }
}
