package com.wltcloud.rabbitmq.controller;

import com.wltcloud.rabbitmq.server.fanout.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：fanout ExChange示例
 * 备注：
 */
@RestController
public class RabbitFanoutTest {

    @Autowired
    private FanoutSender fanoutSender;

    @GetMapping("/fanoutTest")
    public void fanoutTest() {
        fanoutSender.send();
    }
}
