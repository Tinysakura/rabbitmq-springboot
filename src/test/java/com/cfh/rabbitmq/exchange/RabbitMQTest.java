package com.cfh.rabbitmq.exchange;

import com.cfh.rabbitmq.producer.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: cfh
 * @Date: 2018/9/11 10:07
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitMQTest {
    @Autowired
    private MessageProducer messageProducer;

    @Test
    public void firstTest(){
        messageProducer.produce();
    }
}
