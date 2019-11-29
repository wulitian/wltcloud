package com.wltcloud.oauth2.service.impl;

import com.wltcloud.oauth2.entity.TbPermission;
import com.wltcloud.oauth2.service.TbPermissionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wltcloud.oauth2.dao.TbPermissionMapper;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
