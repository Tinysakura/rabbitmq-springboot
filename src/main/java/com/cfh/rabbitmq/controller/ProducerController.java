package com.cfh.rabbitmq.controller;

import com.cfh.rabbitmq.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cfh
 * @Date: 2018/9/11 10:01
 * @Description:
 */
@RestController
public class ProducerController {
    @Autowired
    private MessageProducer messageProducer;

    @RequestMapping("/producer")
    public void producer(){
        messageProducer.produce();
    }
}
