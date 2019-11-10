package com.wltcloud.rabbitmq.server.oneToMany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 功能：生产者
 * 备注：单生产者-多消费者
 */
@Component
public class HelloSender1 {

    private static final Logger log = LoggerFactory.getLogger(HelloSender1.class);

    @Autowired
    public AmqpTemplate amqpTemplate;

    public void send(String msg){
        String context = msg + new Date();
        log.info("Sender1:" + context);
        this.amqpTemplate.convertAndSend("hello",context);
    }

}
