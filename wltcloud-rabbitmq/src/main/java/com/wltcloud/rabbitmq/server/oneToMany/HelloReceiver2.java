package com.wltcloud.rabbitmq.server.oneToMany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 功能：消费者2
 * 备注：单生产者-多消费者
 */
@Component
public class HelloReceiver2 {

    private static final Logger log = LoggerFactory.getLogger(HelloReceiver2.class);

    //监听器监听指定的Queue
    @RabbitListener(queues="hello")
    public void process(String hello){
        log.info("Receiver2:"+hello);
    }
}
