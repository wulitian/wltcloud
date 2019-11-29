package com.wltcloud.oauth2.service;

import com.wltcloud.oauth2.entity.TbUser;

public interface TbUserService{

    public TbUser getByUserName(String username);
}
