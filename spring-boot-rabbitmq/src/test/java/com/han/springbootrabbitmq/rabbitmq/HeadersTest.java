package com.han.springbootrabbitmq.rabbitmq;

import com.han.springbootrabbitmq.headers.HeadersPublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 23:45 2017/11/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HeadersTest {
    @Autowired
    private HeadersPublisher headersPublisher;

    @Test
    public void test() {
        headersPublisher.send();
    }
}
