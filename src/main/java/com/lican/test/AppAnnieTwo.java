package com.lican.test;

public class AppAnnieTwo {
//    public String solution(int N, String S, String T) {
//        // write your code in Java SE 8
//
//    }
public static void main(String[] args) {
    String S = "1A 4A,12A 12A";
    String[] str = S.split(",");
//    System.out.println(str.length);
    for (String a : str){
        System.out.println(a);

//        System.out.println(a.length());
        String[] res = a.split(" ");
        System.out.println(res[0]);
//        System.out.println(a.charAt(0));
    }
//    System.out.println(str[1].charAt(0));
//    System.out.println(str[1].charAt(1));
//    System.out.println(str[1].charAt(2));
//    System.out.println(str[1].charAt(3));
//    System.out.println(str[1].charAt(4));
//    System.out.println(str[1].charAt(1) == str[0].charAt(4));
//    System.out.println(str[1].charAt(3) - str[0].charAt(0));

}

}
