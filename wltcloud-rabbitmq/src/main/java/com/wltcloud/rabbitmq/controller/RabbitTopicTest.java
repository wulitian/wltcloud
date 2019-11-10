package com.wltcloud.rabbitmq.controller;

import com.wltcloud.rabbitmq.server.topic.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：topic ExChange示例
 * 备注：
 */
@RestController
public class RabbitTopicTest {

    @Autowired
    private TopicSender topicSender;

    @GetMapping("/topicTest")
    public void topicTest(){
        topicSender.send();
    }
}
