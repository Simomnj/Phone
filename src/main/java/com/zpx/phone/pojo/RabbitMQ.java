package com.zpx.phone.pojo;

import lombok.Data;

@Data
public class RabbitMQ {
    private String host = "127.0.0.1";
    private int port = 32330;
    private String username = "mq_admi_10187";
    private String password = "factory_29640";
    private String secretKey = "";
    private String receiveQueue = "set.of.pictures.queue10187";
    private String filmShellReceiveQueue = "film.pictures.queue10187";
    private String filmShellSendQueue = "film.pictures.state.queue";
    private String sendQueue = "set.of.pictures.state.queue";
    private String version = "1.0";
}
