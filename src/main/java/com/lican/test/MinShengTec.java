package com.lican.test;

public class MinShengTec {

    public MinShengTec(){
        super();
    }

    public static void main(String[] args) {
        int[] road = {0, 0};
        String a = "UUUDDDRRRLL";
        char[] ar = a.toCharArray();  // 把字符串转为数组形式
        System.out.println(ar);
        for (int i =0; i < a.length(); i++){
//            System.out.println(a.charAt(i));
            if ('U' == a.charAt(i)){
                road[1] += 1;
            }else if ('D' == a.charAt(i)) {
                road[1] -= 1;
            }else if ('R' == a.charAt(i)) {
                road[0] += 1;
            }else if ('L' == a.charAt(i)){
                road[0] -= 1;
            }
        }
//        System.out.println(road[1]);
//        System.out.println(road[0]);
//        System.out.println(a.charAt(0));
    }
}
