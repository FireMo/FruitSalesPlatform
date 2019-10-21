package com.lican.fire;

public class TestA {
    public TestA(){
        System.out.println("TestA");
    }
    {
        System.out.println("A class");
    }
    static {
        System.out.println("static A");
    }
}
class TestB extends TestA{
    public TestB(){
        System.out.println("TestB");
    }
    {
        System.out.println("B class");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        System.out.println("start");
        new TestB();
        new TestA();
        System.out.println("end");
    }
}
