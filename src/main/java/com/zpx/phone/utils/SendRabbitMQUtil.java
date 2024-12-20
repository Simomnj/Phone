package com.zpx.phone.utils;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendRabbitMQUtil {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        // 发送消息到交换机，并指定路由键
        rabbitTemplate.convertAndSend("intelligent.platform.set.of.pictures.exchange", "10187", message);
        System.out.println("Sent message: " + message);
    }

}
