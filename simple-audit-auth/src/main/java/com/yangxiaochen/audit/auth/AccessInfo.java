package com.yangxiaochen.audit.auth;

public class AccessInfo {
    private String userId;
    private String userName;
    private String ip;
    private String userAgent;

    public AccessInfo(String userId, String userName, String ip, String userAgent) {
        this.userId = userId;
        this.userName = userName;
        this.ip = ip;
        this.userAgent = userAgent;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getIp() {
        return ip;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

}
