package com.imooc.proxydemo.JDKdynamicProxy;

import com.imooc.proxydemo.staticProxy.RealSubject;
import com.imooc.proxydemo.staticProxy.Subject;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{Subject.class}, new JdkProxySubject(new RealSubject()));
        subject.hello();
    }
}
