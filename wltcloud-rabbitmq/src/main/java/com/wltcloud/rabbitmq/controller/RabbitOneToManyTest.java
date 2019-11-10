package com.wltcloud.rabbitmq.controller;

import com.wltcloud.rabbitmq.server.oneToMany.HelloSender1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：《用一句描述一下》
 * 备注：单生产者-多消费者
 */
@RestController
public class RabbitOneToManyTest {

    @Autowired
    private HelloSender1 helloSender;

    @GetMapping("/oneToMany")
    public void ontToMany(){
        for (int i=0;i<10;i++){
            helloSender.send("hello smg:"+i);
        }
    }
}
