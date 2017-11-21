package com.han.springbootrabbitmq.direct;

import com.han.springbootrabbitmq.topic.TopicPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:52 2017/11/21
 */
@Component
public class DirectPublisher {
    private final static Logger logger = LoggerFactory.getLogger(DirectPublisher.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String message = "This is topic message @====!";
        logger.info("message => " + message);

        // 参数意义
        // 第一个： exchange 名称
        // 第二个： routingKey
        // 第三个： 发送的消息
        this.amqpTemplate.convertAndSend("ex.direct", "error", message);
    }
}
