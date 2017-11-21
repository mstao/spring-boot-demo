package com.han.springbootrabbitmq.fanout;

import com.han.springbootrabbitmq.topic.TopicConsumerA;
import com.rabbitmq.client.BuiltinExchangeType;
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
public class FanoutConsumerA {
    private final static Logger logger = LoggerFactory.getLogger(FanoutConsumerA.class);

    @RabbitHandler
    public void process(String message) {
        logger.info("ConsumerA Receiver :" + message);
    }
}
