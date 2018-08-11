package com.han.springbootrabbitmq.headers;

import com.han.springbootrabbitmq.topic.TopicProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 23:18 2017/11/21
 */
@Component
public class HeadersProducer {
    private final static Logger logger = LoggerFactory.getLogger(TopicProducer.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String mes = "This is headers message ====!";
        logger.info("message => " + mes);

        // 构建消息
        Message message = MessageBuilder.withBody(mes.getBytes())
                .setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN)
                .setMessageId("123")
                .setHeader("xiaoming", "123456")
                .build();


        // =======================

        MessageProperties props = MessagePropertiesBuilder.newInstance()
                .setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN)
                .setMessageId("123")
                .setHeader("xiaoming", "123456")
                .build();
        Message message2 = MessageBuilder.withBody(mes.getBytes())
                .andProperties(props)
                .build();

        // 参数意义
        // 第一个： exchange 名称
        // 第二个： routingKey
        // 第三个： 发送的消息
        this.amqpTemplate.convertAndSend("ex.headers", "", message);
    }
}
