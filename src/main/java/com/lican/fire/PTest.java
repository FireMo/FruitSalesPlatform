package com.lican.fire;

import java.util.ArrayList;
import java.util.List;

public class PTest {
    public static void main(String[] args) {
        List<Parent> list = new ArrayList<Parent>();
        Parent p = new Son();
        list.add(p);
        list.get(0).greet();

    }
}

class Parent{
    public void greet(){
        System.out.println("P");
    }
}

class Son extends Parent{
    public void greet(){
        System.out.println("S");
    }
}

