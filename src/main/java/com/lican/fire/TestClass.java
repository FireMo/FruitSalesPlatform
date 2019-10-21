package com.lican.fire;

class B extends Object{
    static {
        System.out.println("Load B");
    }

    public B(){
        System.out.println("Create B");
    }
}

class A extends B{
    static {
        System.out.println("Load A");
    }
    public A(){
        System.out.println("Create A");
    }
}

/**
 * 父类静态代码块>子类静态代码块>父类构造方法>子类构造方法
 */

public class TestClass {
    public static void main(String[] args) {
        new A();
        System.out.println("**********");
        new A();
    }
}
