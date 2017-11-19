package com.han.springbootrabbitmq.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 21:25 2017/11/19
 */
@Component
@RabbitListener(queues = "hello_rq")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver1  : " + hello);
    }

}
