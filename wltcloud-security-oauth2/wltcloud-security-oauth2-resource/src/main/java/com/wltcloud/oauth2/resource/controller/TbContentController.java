package com.wltcloud.oauth2.resource.controller;

import com.wltcloud.oauth2.resource.dto.ResponseResult;
import com.wltcloud.oauth2.resource.entity.TbContent;
import com.wltcloud.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseResult<List<TbContent>> list(){
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.toString(),tbContentService.selectAll());
    }
}
