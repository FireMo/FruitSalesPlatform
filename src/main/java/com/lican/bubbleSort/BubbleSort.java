package com.lican.bubbleSort;

/**
 * 冒泡排序
 *
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * 参数：待排序数组 a，
     *       数组长度n
     * 此方法会一直循环n次，如果循环n-3次的时候数组已经是有序的了，那么理论上就可以停止排序了，但次方法并不会停止
     */
    public static void bubbleSortOne(int[] a, int n){
        int i,j;

        for (i=n-1; i>0; i--){
            //将最大的数据放到末尾
            for (j=0; j<i;j++){
                if (a[j] > a[j+1]){
                    // 交换位置
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    /**
     * 冒泡排序（改进版）
     * 参数：待排序数组 a，
     *       数组长度n
     * 解决上述方法的循环次数问题
     */
    public static void bubbleSortTwo(int[] a, int n){
        int i,j;
        int flag;

        for (i=n-1;i>0;i--){
            flag = 0;  // 初始化标记为0
            // 将数组中最大的元素移动到末尾
            for (j=0;j<i;j++){
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = 1; //如果发生了交换 ，则标记为1
                }
            }
            if (flag == 0) {  // 没有发生交换，说明数组已经有序
                break;
            }
        }
    }

    public static void main(String[] args) {
        int i;
        int[] a = {20, 40, 30, 10, 60, 50};

        System.out.printf("before sort: ");
        for (i = 0; i<a.length; i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");

        bubbleSortOne(a, a.length);
//        bubbleSortTwo(a, a.length);

        System.out.printf("after sort: ");
        for (i=0; i<a.length; i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}
