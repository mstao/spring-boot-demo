package com.han.springbootrabbitmq.fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:12 2017/11/21
 */
@Component
@RabbitListener(bindings = @QueueBinding(value = @Queue,
        exchange = @Exchange(value = "ex.fanout", type = ExchangeTypes.FANOUT)
))
public class FanoutConsumerB {
    private final static Logger logger = LoggerFactory.getLogger(FanoutConsumerB.class);

    @RabbitHandler
    public void process(String message) {
        logger.info("ConsumerB Receiver :" + message);
    }
}