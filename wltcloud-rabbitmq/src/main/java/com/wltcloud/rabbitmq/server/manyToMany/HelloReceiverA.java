package com.wltcloud.rabbitmq.server.manyToMany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 功能：消费者1
 * 备注：多生产者-多消费者
 */
@Component
public class HelloReceiverA {

    private static final Logger log = LoggerFactory.getLogger(HelloReceiverA.class);

    //监听器监听指定的Queue
    @RabbitListener(queues="hello")
    public void process(String hello){
        log.info("ReceiverA:"+hello);
    }
}
