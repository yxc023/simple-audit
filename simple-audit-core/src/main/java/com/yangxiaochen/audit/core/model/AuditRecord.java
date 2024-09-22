package com.yangxiaochen.audit.core.model;

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

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getEndPointName() {
        return endPointName;
    }

    public void setEndPointName(String endPointName) {
        this.endPointName = endPointName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "AuditRecord(requestId=" + this.getRequestId() + ", endPointName=" + this.getEndPointName() + ", tag=" + this.getTag() + ", userid=" + this.getUserid() + ", username=" + this.getUsername() + ", userDetails=" + this.getUserDetails() + ", content=" + this.getContent() + ")";
    }
}
