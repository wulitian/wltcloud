package com.wltcloud.rabbitmq.controller;


import com.wltcloud.rabbitmq.server.callback.CallBackSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：callback的消息发送
 * 备注：
 */
@RestController
public class RabbitCallBackTest {

    @Autowired
    private CallBackSender callBackSender;

    //执行代码可以看出callbackSender发出的UUID，收到了回应，又传回来了。
    @GetMapping("/callback")
    public void callback() {
        callBackSender.send();
    }
}
