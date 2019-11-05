package com.wltcloud.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.wltcloud.mybatis.entity.Person;
import com.wltcloud.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/a")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    public JSONObject selectAll(){
        List<Person> people = personService.selectAll();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",people);
        return jsonObject;
    }
}
