package com.han.springbootrabbitmq.rabbitmq;

import com.han.springbootrabbitmq.direct.DirectProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 23:04 2017/11/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DirectTest {
    @Autowired
    private DirectProducer directProducer;

    @Test
    public void test() {
        directProducer.send();
    }
}
