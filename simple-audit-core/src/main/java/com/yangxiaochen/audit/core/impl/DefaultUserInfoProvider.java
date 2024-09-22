package com.yangxiaochen.audit.core.impl;

import com.yangxiaochen.audit.core.UserInfoProvider;
import com.yangxiaochen.audit.core.model.UserInfo;


public class DefaultUserInfoProvider implements UserInfoProvider {
    @Override
    public UserInfo getUserInfo() {
        return new UserInfo("1", "defaultName", "defaultDetails");
    }
}
