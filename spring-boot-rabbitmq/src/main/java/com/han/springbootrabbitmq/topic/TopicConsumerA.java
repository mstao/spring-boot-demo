package com.han.springbootrabbitmq.topic;

import com.han.springbootrabbitmq.hello.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 23:00 2017/11/20
 */
@Component
@RabbitListener(bindings = @QueueBinding(
        //value = @Queue(value = "myQueue", durable = "true"),
        value = @Queue, // 自动生成， 自动删除
        exchange = @Exchange(value = "ex.topic", ignoreDeclarationExceptions = "true", type = ExchangeTypes.TOPIC),
        key = "*.orange.*")
)
public class TopicConsumerA {
    private final static Logger logger = LoggerFactory.getLogger(TopicConsumerA.class);

    @RabbitHandler
    public void process(String message) {
        logger.info("ConsumerA Receiver :" + message);
    }

}
