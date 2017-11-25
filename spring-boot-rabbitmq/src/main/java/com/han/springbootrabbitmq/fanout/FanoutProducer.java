package com.han.springbootrabbitmq.fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:12 2017/11/21
 */
@Component
public class FanoutProducer {
    private final static Logger logger = LoggerFactory.getLogger(FanoutProducer.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String message = "This is topic message ====!";
        logger.info("message => " + message);
        this.amqpTemplate.convertAndSend("ex.fanout","", message);
    }

}
