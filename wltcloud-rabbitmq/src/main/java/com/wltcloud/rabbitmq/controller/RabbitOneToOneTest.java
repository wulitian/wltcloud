package com.wltcloud.rabbitmq.controller;


import com.wltcloud.rabbitmq.server.oneToOne.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：《直接从队列中接收消息》
 * 备注：单生产者-单消费者
 */
@RestController
public class RabbitOneToOneTest {

    @Autowired
    private HelloSender helloSender;

    @GetMapping("/hello")
    public void hello(){
        helloSender.send();
    }

}
