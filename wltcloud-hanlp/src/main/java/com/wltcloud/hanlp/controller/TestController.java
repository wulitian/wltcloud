package com.wltcloud.hanlp.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public Result select(){
        return new Result(true, StatusCode.OK, "添加成功");
    }
}
