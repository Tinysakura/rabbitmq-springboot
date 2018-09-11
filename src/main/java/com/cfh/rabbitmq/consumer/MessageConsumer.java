package com.cfh.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/11 09:46
 * @Description: 消息消费者
 */
@Component
@RabbitListener(queues = "firstSpringBootQueue")//指定消费者绑定的队列，可以指定多个
public class MessageConsumer {
    final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    //消费逻辑
    @RabbitHandler
    public void consumer(String message){
        log.info("consumer consume message:{}",message);
    }

}
