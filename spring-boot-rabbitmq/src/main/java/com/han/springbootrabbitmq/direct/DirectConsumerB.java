package com.han.springbootrabbitmq.direct;

import com.han.springbootrabbitmq.topic.TopicConsumerA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:58 2017/11/21
 */
@Component
@RabbitListener(bindings = @QueueBinding(value = @Queue,
        exchange = @Exchange(value = "ex.direct", type = ExchangeTypes.DIRECT),
        key = "error"
))
public class DirectConsumerB {
    private final static Logger logger = LoggerFactory.getLogger(DirectConsumerB.class);

    @RabbitHandler
    public void process(String message) {
        logger.info("ConsumerA Receiver :" + message);
    }
}