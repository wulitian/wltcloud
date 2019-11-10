package com.wltcloud.rabbitmq.controller;

import com.wltcloud.rabbitmq.server.manyToMany.HelloSenderA;
import com.wltcloud.rabbitmq.server.manyToMany.HelloSenderB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：《用一句描述一下》
 * 备注：多生产者-多消费者
 */
@RestController
public class RabbitManyToManyTest {

    @Autowired
    private HelloSenderA helloSenderA;

    @Autowired
    private HelloSenderB helloSenderB;

    @GetMapping("/manyToMany")
    public void ontToMany(){
        for (int i=0;i<10;i++){
            helloSenderA.send("hello smg:"+i);
            helloSenderB.send("hello smg:"+i);
        }
    }
}
