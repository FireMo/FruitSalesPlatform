package com.lican.fire;

import java.util.HashSet;
import java.util.Set;

public class InitialTest {

    /**
     *
     */
    public static void main(String[] args) {
//        Fruit fruit = new Fruit();
//        Fruit fruit1 = new Apple();
//
//        fruit.show_name(1);
//        fruit1.show_name(2);
        Fruit one = new Fruit();
        Fruit two = new Fruit();

        Set<Fruit> set1 = new HashSet<Fruit>();
        set1.add(one);
        set1.add(two);
        System.out.println("长度：" + set1.size() + ",内容为：" + set1);
    }
}
