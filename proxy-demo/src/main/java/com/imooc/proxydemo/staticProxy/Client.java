package com.imooc.proxydemo.staticProxy;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
        subject.hello();
    }
}
