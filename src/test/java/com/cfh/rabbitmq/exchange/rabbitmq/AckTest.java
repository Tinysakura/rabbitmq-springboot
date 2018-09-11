package com.cfh.rabbitmq.exchange.rabbitmq;

import com.cfh.rabbitmq.ack.AckSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: cfh
 * @Date: 2018/9/11 19:10
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AckTest {

    @Autowired
    AckSender ackSender;

    @Test
    public void test(){
        ackSender.send();
    }
}
