package com.lican.nowcooer;

public class OddAndEven {
    public static void main(String[] args) {
        int eo = 0;
//        char[] arr ={'C','B', 'D','A','A','B','C'};
        int[] arr = {10, 11, 13, 10, 11,12,12};
        for (int i : arr){
            eo = eo ^ i;
        }
//        for (char s:arr){
//            eo = eo ^ s;
//        }
//        System.out.println((char)eo);
        System.out.println(eo);
    }
}
