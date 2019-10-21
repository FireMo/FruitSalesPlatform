package com.lican.nowcooer;

public class ChangeTwoNum {
    public static void main(String[] args) {
        int a = 2, b = 4;
//        第一种方式
//        a = a + b;
//        b = a - b;
//        a = a - b;

//        第二种方式
//        a =  a ^ b;
//        b =  a ^ b;
//        a =  a ^ b;

//        第三种方式
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a);
        System.out.println(b);
    }

}
