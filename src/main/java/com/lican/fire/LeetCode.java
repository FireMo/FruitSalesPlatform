package com.lican.fire;

public class LeetCode {
    public static void main(String[] args) {
        long sor = 45689;
        long ret = 0;
        while (sor != 0){
            ret = ret * 10 + sor % 10;
            sor /= 10;
        }
        System.out.println(ret);
    }
}
