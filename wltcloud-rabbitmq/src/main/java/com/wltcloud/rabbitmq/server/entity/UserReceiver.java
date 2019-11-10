package com.wltcloud.rabbitmq.server.entity;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 功能：实体类传输
 * 备注：消费者
 */
@Component
@RabbitListener(queues = "user")
public class UserReceiver {

    private static final Logger log = LoggerFactory.getLogger(UserReceiver.class);

    @RabbitHandler
    public void process(User user) {
        log.info("user Receive:" + user.getName() + "," + user.getPass());
    }
}
