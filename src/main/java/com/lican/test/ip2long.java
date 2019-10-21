package com.lican.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ip2long {
    /**
     * 将字符串表示的ip地址，转换为long形式表示
     * 输入：ip地址
     * 输出：
     */
    public static long ip2long(String ip){
        String[] ipNums = ip.split("\\.");
        return (Long.parseLong(ipNums[0])<<24) + (Long.parseLong(ipNums[1])<<16)
                + (Long.parseLong(ipNums[2])<<8) + (Long.parseLong(ipNums[3]));
    }


    public static void main(String[] args) {
        List<String> ipNum = new ArrayList<String>(){
            {
                add("192.68.0.1");
                add("192.189.2.1");
                add("10.189.2.1");
                add("10.10.2.1");
            }};
        Map<String, Object> map = new HashMap<String, Object>();
        List<Long> result = new ArrayList<Long>();
        for (String ip : ipNum){
            result.add(ip2long(ip));
            System.out.println(ip2long(ip));
        }
    }
}
