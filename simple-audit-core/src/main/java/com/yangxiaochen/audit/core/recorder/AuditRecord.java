package com.yangxiaochen.audit.core.recorder;


import lombok.Data;

@Data
public class AuditRecord {
    private String requestId;
    private String endPointName;
    private String tag;
    private String userid;
    private String username;
    private String userDetails;
    private String content;

    public AuditRecord(String requestId, String endPointName, String tag, String userid, String username, String userDetails, String content) {
        this.requestId = requestId;
        this.endPointName = endPointName;
        this.tag = tag;
        this.userid = userid;
        this.username = username;
        this.userDetails = userDetails;
        this.content = content;
    }


}
