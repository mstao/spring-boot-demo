package com.han.springbootrabbitmq.rabbitmq;

import com.han.springbootrabbitmq.topic.TopicConsumerA;
import com.han.springbootrabbitmq.topic.TopicConsumerB;
import com.han.springbootrabbitmq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 23:56 2017/11/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TopicTest {
    @Autowired
    private TopicSender topicSender;

    @Test
    public void test() {
        topicSender.send();
    }
}
