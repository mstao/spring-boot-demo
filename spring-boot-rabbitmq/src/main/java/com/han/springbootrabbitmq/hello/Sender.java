package com.han.springbootrabbitmq.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 21:13 2017/11/19
 */
@Component
public class Sender {
    private final static Logger logger = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello " + new Date();
        logger.info("Sender : " + context);
        this.amqpTemplate.convertAndSend("hello_rq", context);
    }
}
