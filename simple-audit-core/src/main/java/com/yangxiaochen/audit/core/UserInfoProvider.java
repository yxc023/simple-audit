package com.yangxiaochen.audit.core;

import com.yangxiaochen.audit.core.model.UserInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户信息接口
 */
public interface UserInfoProvider {
    UserInfo getUserInfo();

}
