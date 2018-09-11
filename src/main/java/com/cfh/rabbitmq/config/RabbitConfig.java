package com.cfh.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cfh
 * @Date: 2018/9/11 09:41
 * @Description: rabbitmq的配置类
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("firstSpringBootQueue");//创建一个队列
    }
}
