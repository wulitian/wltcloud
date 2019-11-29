package com.wltcloud.oauth2.dao;

import com.wltcloud.oauth2.entity.TbPermission;
import com.wltcloud.oauth2.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}