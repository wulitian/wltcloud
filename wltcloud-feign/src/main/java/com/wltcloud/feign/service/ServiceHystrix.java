package com.wltcloud.feign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHystrix implements FeignService {

    @Override
    public String sayHi(String message) {
        return "你发送的消息为 :\"" + message + "\" 但是请求错误.";
    }
}
