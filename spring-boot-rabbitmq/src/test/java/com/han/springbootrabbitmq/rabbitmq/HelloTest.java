package com.han.springbootrabbitmq.rabbitmq;

import com.han.springbootrabbitmq.hello.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:50 2017/11/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HelloTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
