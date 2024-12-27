package com.zpx.phone.controller;

import com.zpx.phone.utils.SendRabbitMQUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendRabbitMQController {
    @Autowired
    private SendRabbitMQUtil sendRabbitMQUtil;

    @GetMapping("/send")
    public String send() {
        //sendRabbitMQUtil.sendMessage("Test message");
        return "消息已发送！";
    }
}
