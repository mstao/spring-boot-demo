package com.han.springbootemail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 21:54 2017/11/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleMailTest() {
        mailService.sendSimpleMail("499445428@qq.com", "Test simple email", "laaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("499445428@qq.com","test simple html mail",content);
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath="d:\\log.log";
        mailService.sendAttachmentsMail("499445428@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void sendInlineResourceMail() {
        String rscId = "mingshan1111";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + ":image\' ></body></html>";
        String imgPath = "D:\\images\\001.jpg";

        mailService.sendInlineResourceMail("499445428@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
