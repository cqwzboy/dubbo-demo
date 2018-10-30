package com.fuqinqin;

/**
 * Created by fuqinqin on 2018/10/30.
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
