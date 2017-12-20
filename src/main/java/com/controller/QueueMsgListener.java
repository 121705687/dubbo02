package com.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Component  //spring配置监听队列中的消息
@EnableJms  //测试可行  ok
public class QueueMsgListener {

    //当收到消息后，自动调用该方法,spring配置默认监听器，负责接收消息
    @JmsListener(containerFactory = "jmsListenerContainerFactory", destination = "test05")
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("接收到消息："+tm.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
