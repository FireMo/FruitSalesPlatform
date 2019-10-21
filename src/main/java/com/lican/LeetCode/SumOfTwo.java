package com.lican.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

    public static synchronized int[] twoSum(int[] nums, int target){
//        int[] ret = new int[2];
//        for (int i =0; i<nums.length;i++){
//            for (int j = i;j<nums.length; j++){
//                if (target == nums[i] + nums[j]){
//                    ret[0] = i;
//                    ret[1] = j;
//                }
//            }
//        }
//        return ret;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i< nums.length; i++){
            int j = target - nums[i];
            if (map.containsKey(j)){
                return new int[]{i, map.get(j)};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] rest = twoSum(nums, 17);
        System.out.println(rest[0]);
        System.out.println(rest[1]);
    }


}
