package com.lican.fire;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        System.out.println(reverseStr("Hello Lican"));
        System.out.println("----------");
        System.out.println(reverseWords("Hello"));
    }

    //利用栈实现
    public static String reverseStr(String words){
        Stack<String> stack = new Stack<String>();
        char[] wchar = words.toCharArray();
        for (char single:wchar){
            stack.push(String.valueOf(single));
        }
        String reverse = "";
        while (!stack.isEmpty()){
            reverse += stack.pop();
        }
        return reverse;
    }

    //单词切割为字符转换
    public static String reverseWords(String words){
        char[] simple = words.toCharArray();
        List<String> strList = new ArrayList<String>();
        for (char single : simple){
            strList.add(String.valueOf(single));
        }
        Object[] simpleChar = strList.toArray();
        StringBuilder sb = new StringBuilder();
        for (int i = simpleChar.length-1;i>=0;i--){
            sb.append(simpleChar[i]);
        }
        return sb.toString();
    }

}
