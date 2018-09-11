package com.cfh.rabbitmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/11 09:46
 * @Description: 消息生产者
 */
@Component
public class MessageProducer {
    final Logger log = LoggerFactory.getLogger(MessageProducer.class);


    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void produce(){
        log.info("produce a message");

        rabbitTemplate.convertAndSend("firstSpringBootQueue","my first rabbit-springboot message");
    }
}
