package com.yangxiaochen.audit.core.test;

import com.yangxiaochen.audit.core.SimpleAudit;
import com.yangxiaochen.audit.core.SimpleAuditConfig;
import com.yangxiaochen.audit.core.recorder.AuditRecord;
import com.yangxiaochen.audit.core.recorder.MysqlAuditRecorder;
import com.yangxiaochen.audit.core.request.UUIDRequestIdProvider;
import org.junit.jupiter.api.Test;

public class AuditTest {

    @Test
    void test() {
        SimpleAuditConfig config = new SimpleAuditConfig(new MysqlAuditRecorder(), new UUIDRequestIdProvider());
        SimpleAudit simpleAudit = new SimpleAudit(config);

        AuditRecord record = new AuditRecord("requestId", "endPointName", "tag", "userid", "username", "userDetails", "content");

        simpleAudit.audit("get /api/v1/user", "LOG", "username", "username", "userDetails", "content");
    }
}
