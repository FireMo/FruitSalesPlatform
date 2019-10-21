package com.lican.fire;

public class StrSplite {
    private static void reverseSen(String sentence){
        if (sentence == null){
            return;
        }
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i] + "");
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length-1;i >= 0 ;i--){
            sb.append(str[i] + " ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String s = "hello,the sky is blue";
        reverseSen(s);
    }
}
