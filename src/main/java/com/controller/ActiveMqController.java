package com.controller;

import com.sun.jdi.request.EventRequestManager;
import com.util.PrintWriterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/activeMq")
public class ActiveMqController {
    @Autowired
    JmsTemplate jmsQueueTemplate;

    @RequestMapping("/test01")//ok
    public void test01(HttpServletRequest request, HttpServletResponse response){
        jmsQueueTemplate.send("队列模式模型", new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("测试的消息爽不爽");
            }
        });
        PrintWriterUtil.print(response,"发送成功！");
    }
    @RequestMapping("/test02")  //ok
    public void test02(HttpServletRequest request, HttpServletResponse response){
        jmsQueueTemplate.setDefaultDestinationName("test02");
        jmsQueueTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                Message message = session.createMessage();
                return session.createTextMessage("这是test02发送的消息");
            }
        });
        PrintWriterUtil.print(response,"发送成功！");
    }

    @RequestMapping("/test03")  //不可行，没有给定名字
    //java.lang.IllegalStateException: No 'defaultDestination' or 'defaultDestinationName' specified. Check configuration of JmsTemplate.
    public void test03(HttpServletRequest request, HttpServletResponse response){
        jmsQueueTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("这是test03发送的消息");
            }
        });
        PrintWriterUtil.print(response,"发送成功！");
    }

    @RequestMapping("/test04")  //ok
    public void test04(HttpServletRequest request, HttpServletResponse response)throws JMSException{
        TextMessage txtmsg = (TextMessage) jmsQueueTemplate.receive("队列模式模型");
        System.out.println(txtmsg);
        if (null != txtmsg) {
            System.out.println("[DB Proxy] " + txtmsg);
            System.out.println("[DB Proxy] 收到消息内容为: "+ txtmsg.getText());
        }
        PrintWriterUtil.print(response,"接受成功！");
    }

    @RequestMapping("/test05")  //ok
    public void test05(HttpServletRequest request, HttpServletResponse response){
        jmsQueueTemplate.setDefaultDestinationName("test05");//必须要，多种写法
        jmsQueueTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText("这是测试加入id");//消息内容
                textMessage.setJMSMessageID("111111");//可不用
                textMessage.setJMSCorrelationID("11111199");//可不用
                return textMessage;
            }
        });
        PrintWriterUtil.print(response,"发送成功！");//
    }
}
