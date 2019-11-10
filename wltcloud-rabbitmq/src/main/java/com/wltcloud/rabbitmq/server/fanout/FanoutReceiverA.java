package com.wltcloud.rabbitmq.server.fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 功能：fanout ExChange示例
 * 备注：消费者A
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {

    private static final Logger log = LoggerFactory.getLogger(FanoutReceiverA.class);

    @RabbitHandler
    public void process(String msg) {
        log.info("FanoutReceiverA  : " + msg);
    }
}
