package com.wltcloud.mybatis.plus.controller;


import com.alibaba.fastjson.JSONObject;
import com.wltcloud.mybatis.plus.entity.Person;
import com.wltcloud.mybatis.plus.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wulitian
 * @since 2019-11-05
 */
@RestController
@RequestMapping("/a")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    public JSONObject selectAll(){
        List<Person> list = iPersonService.list();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("person",list);
        return jsonObject;
    }
}
