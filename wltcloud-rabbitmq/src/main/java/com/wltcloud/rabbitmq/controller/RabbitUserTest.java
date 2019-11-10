package com.wltcloud.rabbitmq.controller;

import com.wltcloud.rabbitmq.server.entity.UserSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：实体类传输测试
 * 备注：
 */
@RestController
public class RabbitUserTest {

    @Autowired
    private UserSender userSender;

    @GetMapping("/userTest")
    public void userTets(){
        userSender.send();
    }
}
