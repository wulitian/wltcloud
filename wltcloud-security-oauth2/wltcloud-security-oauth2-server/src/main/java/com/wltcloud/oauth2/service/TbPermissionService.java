package com.wltcloud.oauth2.service;

import com.wltcloud.oauth2.entity.TbPermission;

import java.util.List;

public interface TbPermissionService{
    List<TbPermission> selectByUserId(Long userId);
}
