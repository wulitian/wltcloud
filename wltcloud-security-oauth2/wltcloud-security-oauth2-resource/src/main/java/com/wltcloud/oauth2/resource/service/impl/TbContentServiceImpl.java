package com.wltcloud.oauth2.resource.service.impl;

import com.wltcloud.oauth2.resource.entity.TbContent;
import com.wltcloud.oauth2.resource.service.TbContentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wltcloud.oauth2.resource.dao.TbContentMapper;

import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService {

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
