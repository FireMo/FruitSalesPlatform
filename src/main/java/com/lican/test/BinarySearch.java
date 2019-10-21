package com.lican.test;

import java.util.Arrays;

/**
 * java用Arrays.binarySearch()  快速定位数字范围
 */
public class BinarySearch {
    public static void main(String[] args) {
        byte byteArr[] = {10, 20, 15, 22, 35};
        Arrays.sort(byteArr);

        System.out.println("The sorted byte array is : ");
        for (byte number : byteArr) {
            System.out.println(number);
        }

        byte searchVa1 = 15;
        byte searchVa2 = 22;

        int retVa1 = Arrays.binarySearch(byteArr, searchVa1);
        int retVa2 = Arrays.binarySearch(byteArr, searchVa2);

        int position1 = retVa1>=0?retVa1:-retVa1-2;
        int position2 = retVa2>=0?retVa2:-retVa2-2;

        System.out.println("The index of 15 element is :" + position1);
        System.out.println("The index of 22 element is :" + position2);

    }
}
