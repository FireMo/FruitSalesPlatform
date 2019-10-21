package com.imooc.proxydemo.staticProxy;

/**
 * 目标对象
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real subject execute request");
    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
