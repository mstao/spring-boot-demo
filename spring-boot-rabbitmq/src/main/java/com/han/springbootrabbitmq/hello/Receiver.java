package com.han.springbootrabbitmq.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 21:25 2017/11/19
 */
@Component
@RabbitListener(queues = "hello_rq")
public class Receiver {
    private final static Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String hello) {
        logger.info("Receiver1  : " + hello);
    }

}
