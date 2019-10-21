package com.lican.fire;

public class strRes {
    public static String resersel(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello lican";
        String res = resersel(str);
        System.out.println(res);
    }
}
