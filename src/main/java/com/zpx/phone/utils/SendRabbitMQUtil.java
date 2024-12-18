package com.zpx.phone.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.GetResponse;
import com.zpx.phone.pojo.RabbitMQMessqge;

import java.io.DataInput;

public class SendRabbitMQUtil {
    private final static String QUEUE_NAME = "set.of.pictures.state.queue10002";

    public static void main(String[] argv) throws Exception {
        // 创建一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("42.193.217.100"); // 设置RabbitMQ服务器地址
        factory.setPort(5672); // 默认的AMQP端口
        factory.setUsername("mq_1ARD_10002"); // 用户名
        factory.setPassword("factory_40897"); // 密码

                // 创建一个连接工厂
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("192.168.1.53"); // 设置RabbitMQ服务器地址
//        factory.setPort(32330); // 默认的AMQP端口
//        factory.setUsername("mq_admi_10187"); // 用户名
//        factory.setPassword("factory_29640"); // 密码

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            // 获取队列中的单个消息
            GetResponse response = channel.basicGet(QUEUE_NAME, true);
            //美化输出开启
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            if (response != null) {
                String message = new String(response.getBody(), "UTF-8");
                // 格式化输出
                System.out.println(objectMapper.writeValueAsString(objectMapper.readTree(message)));
            } else {
                System.out.println("No messages in the queue.");
            }


        }



    }
}
