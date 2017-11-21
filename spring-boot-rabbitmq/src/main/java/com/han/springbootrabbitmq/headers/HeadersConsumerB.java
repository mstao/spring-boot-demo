package com.han.springbootrabbitmq.headers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 23:18 2017/11/21
 */
@Component
@RabbitListener(bindings = @QueueBinding(value = @Queue,
        exchange = @Exchange(value = "ex.headers", type = ExchangeTypes.HEADERS),
        arguments = {
                @Argument(name = "x-match", value = "any"),
                @Argument(name = "xiaoming", value = "1111"),
                @Argument(name = "bbb", value = "1234567")
        }
))
public class HeadersConsumerB {
    private final static Logger logger = LoggerFactory.getLogger(HeadersConsumerB.class);

    @RabbitHandler
    public void process(String message) {
        logger.info("ConsumerB Receiver :" + message);
    }
}
