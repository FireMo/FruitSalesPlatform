package com.lican.HuaWei;

public class Test1 {
    public static void main(String[] args) {
        String str = "hello world";
        String[] rest = str.split(" ");
        System.out.println(rest.length);
        System.out.println(rest[1]);
        int result = rest[1].length();
        System.out.println(result);
    }
}
