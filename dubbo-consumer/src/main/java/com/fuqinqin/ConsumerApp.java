package com.fuqinqin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fuqinqin on 2018/10/30.
 */
public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"});
        context.start();
        IHelloService service = (IHelloService) context.getBean("helloService");
        System.out.println(service.sayHello("world"));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.close();
    }
}
