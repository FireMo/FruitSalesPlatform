package com.lican.DouYin;

/**
 * @Descirption TODO
 * @Author FireMo
 * @Date 2019/9/10 11:03
 */
public class Test5 {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = new Integer(5);

        Integer c = 5;
        Integer d = 5;

        Integer e = 128;
        Integer f = 128;

        int g = 128;

        System.out.println(a == b); //false 内存地址不同
        System.out.println(b == c); //false 存储位置不同
        System.out.println(c == d); //true 小于127，所以返回的是integerCache中已有的地址
        System.out.println(e == f); //false 大于127，创建新对象
        System.out.println(f == g); //true 自动拆箱为int
    }
}
