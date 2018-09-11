package com.cfh.rabbitmq.ack;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

//RabbitTemplate.ConfirmCallback
@Service
public class AckSender implements RabbitTemplate.ReturnCallback,RabbitTemplate.ConfirmCallback {

    @Autowired
//    private AmqpTemplate rabbitTemplate;
    private RabbitTemplate rabbitTemplate;

    public void send() {
        String context = "你好现在是 " + new Date() + "";
        System.out.println("HelloSender发送内容 : " + context);
//        this.rabbitTemplate.setConfirmCallback(this);
        this.rabbitTemplate.setMandatory(true);
        this.rabbitTemplate.setReturnCallback(this);
        //this.rabbitTemplate.setConfirmCallback(this);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println("sender return success" + message.toString() + "===" + i + "===" + s1 + "===" + s2);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if (!ack) {
            System.out.println("HelloSender消息发送失败" + cause + correlationData.toString());
        } else {
            System.out.println("HelloSender 消息发送成功 ");
        }
    }
}
