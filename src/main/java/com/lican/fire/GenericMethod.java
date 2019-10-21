package com.lican.fire;

public class GenericMethod {
    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }

    public static void main(String[] args) {
        String o = GenericMethod.<String>getMiddle("123","result","12");
//        System.out.println(o);

        String str = "12!3!#!#!#!";
        String[] res = str.split("!");
        for (String re : res) {
            System.out.println(re);
        }
    }
}
