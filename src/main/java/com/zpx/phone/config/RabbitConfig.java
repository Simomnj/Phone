package com.zpx.phone.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfig {

//    // 定义Direct类型的交换机
//    @Bean
//    public DirectExchange directExchange() {
//        return new DirectExchange("intelligent.platform.set.of.pictures.exchange");
//    }
//
//    // 定义队列
//    @Bean
//    public Queue queue() {
//        return new Queue("set.of.pictures.queue10187");
//    }
//
//    // 将队列与交换机绑定
//    @Bean
//    public Binding binding() {
//        return BindingBuilder.bind(queue()).to(directExchange()).with("10187");
//    }
}
