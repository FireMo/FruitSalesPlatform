package com.lican.DouYin;

/**
 * @Descirption TODO
 * @Author FireMo
 * @Date 2019/9/10 11:03
 */
public class Test3 {

    /**
     * 功能描述: java中的不定参数
     * @Param: [orderIds]
     * @Return: void
     * @Author: FireMo
     * @Date: 2019/9/10 11:26
     */
    public static void pay(int... orderIds){
        for (int orderId : orderIds){
            System.out.println("订单号：" + orderId);
        }
    }

    public static void main(String[] args) {
        pay(100, 120, 122);
    }
}
