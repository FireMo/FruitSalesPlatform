package com.lican.test;

import java.util.*;
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String s = N +"";
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++){
            int n = Integer.parseInt(s.substring(i, i+1));
            ret.add(n);
        }
        Collections.sort(ret, Collections.<Integer>reverseOrder());

        int sum = 0;
        for (int j = 0; j < ret.size(); j++){
            int resu = (int) (ret.get(j) * Math.pow(10, ret.size() -(j + 1)));
            sum += resu;
        }
        if (sum > 100000000) {
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int result = test.solution(647);
        System.out.println(result);
    }
}
