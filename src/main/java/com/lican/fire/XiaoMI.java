package com.lican.fire;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class XiaoMI {
    public static StringBuilder stringDeal(String s){
        StringBuilder stb = new StringBuilder();
        s = s.trim();

        if (s.length() == 1){
            stb.append(s.charAt(0));
            return stb;
        }
        for (int i = 0;i < s.length()-1; i++){
            if ('\\' == s.charAt(i) && '\\' != s.charAt(i+1)){
                stb.append(s.charAt(i+1));
            }else if ('\\' == s.charAt(i) && '\\' == s.charAt(i+1)){
                stb.append('\\');
            }else if ('\\' != s.charAt(i) && '\\' == s.charAt(i+1)){
                stb.append(s.charAt(i));
            }else if ('\\' != s.charAt(i) && '\\' != s.charAt(i+1)){
                stb.append(s.charAt(i+1));
            }

        }
        return stb;
    }

    public static void main(String[] args) {


        List mn = new ArrayList();
        List ms = new LinkedList();
        System.out.println(mn.size());
        try{
            mn.get(0);
            //其他业务逻辑
        }catch (Exception e){
            System.out.println("进入到catch中");
            System.out.println(e.getMessage());
        }
//        System.out.println(mn.get(0));
        System.out.println("*******");

        String s = "m\\a\\b\\c\\\\d\\f\\g\\h";
        System.out.println(s);
//        s = s.replace("\\\\","*");//替换指定字符
//        s = s.replace("\\", "");
//        s = s.replace("*", "\\");
        System.out.println(s.replace("\\\\","`")
                            .replace("\\","")
                            .replace("`","\\"));
        String[] strArray = {
                "a",
                "\\a",
                "\\\\",
                "\\a\\\\b",
                "\\\\a\\\\b\\c",
                "\\a\\\\\\\\b\\",
                "\\\\\\a\\b\\\\c"
        };
        for (String str : strArray){
            System.out.println(str + "结果为：" + str.replace("\\\\","`")
            .replace("\\", "").replace("`","\\"));
        }
    }
}
