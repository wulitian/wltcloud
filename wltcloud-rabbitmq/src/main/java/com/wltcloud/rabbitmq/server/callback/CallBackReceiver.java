package com.wltcloud.rabbitmq.server.callback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 功能：callback的消息发送
 * 备注：消费者
 */
@Component
@RabbitListener(queues = "topic.messages")
public class CallBackReceiver {

    private static final Logger log = LoggerFactory.getLogger(CallBackReceiver.class);

    @RabbitHandler
    public void process(String msg) {
        log.info("CallBackReceiver : " +msg);
    }
}
