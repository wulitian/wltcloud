package com.wltcloud.rabbitmq.server.oneToOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 功能：生产者
 * 备注：单生产者-单消费者
 */
@Component
public class HelloSender {

    private static final Logger log = LoggerFactory.getLogger(HelloSender.class);

    @Autowired
    public AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello " + new Date();
        log.info("Sender:" + context);
        this.amqpTemplate.convertAndSend("hello",context);
    }

}
