package com.lican.CartoonAlgorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Descirption 红包算法，
 * 二倍均值法
 * @Author FireMo
 * @Date 2019/9/11 16:09
 */
public class RedPacket {

    /**
     * 功能描述:
     * @Param: [totalAmount：总金额（分）, totalPersonNum：总人数]
     * @Return: java.util.List<java.lang.Integer>
     * @Author: FireMo
     * @Date: 2019/9/11 16:10
     */
    public static List<Integer> divideRedPackage(Integer totalAmount, Integer totalPersonNum){
        List<Integer> amountList = new ArrayList<Integer>();
        Integer restAmount = totalAmount; //剩余金额
        Integer restPersonNum = totalPersonNum; //剩余人数
        Random random = new Random();
        for (int i = 0; i<totalPersonNum-1;i++){
            //随机范围：[1，剩余人均金额的2倍 - 1]分
            int amount = random.nextInt(restAmount/restPersonNum * 2 - 1) + 1;
            restAmount -= amount;
            restPersonNum--;
            amountList.add(amount);
        }
        amountList.add(restAmount);
        return amountList;
    }

    public static void main(String[] args) {
        List<Integer> amountList = divideRedPackage(1000, 10);
        for (Integer amount : amountList){
            System.out.println("抢到金额（元）：" + new BigDecimal(amount).divide(new BigDecimal(100)));
        }
    }
}
