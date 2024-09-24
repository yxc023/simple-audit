package com.yangxiaochen.audit.spring.model;


public class UserInfo {
    private String userId;
    private String username;
    private String userDetails;

    public UserInfo(String userId, String username, String userDetails) {
        this.userId = userId;
        this.username = username;
        this.userDetails = userDetails;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserDetails() {
        return userDetails;
    }

}