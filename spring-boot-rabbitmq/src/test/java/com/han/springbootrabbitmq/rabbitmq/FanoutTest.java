package com.han.springbootrabbitmq.rabbitmq;

import com.han.springbootrabbitmq.fanout.FanoutPublisher;
import com.han.springbootrabbitmq.topic.TopicPublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:40 2017/11/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FanoutTest {
    @Autowired
    private FanoutPublisher fanoutPublisher;

    @Test
    public void test() {
        fanoutPublisher.send();
    }
}
