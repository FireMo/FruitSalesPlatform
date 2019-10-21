package com.lican.test;

public class DaNaoi {

    private static void getByteValue(int i){
        byte b = (byte) i;
        System.out.println(b);
    }

    public static void main(String[] args) {
//        DaNaoi daNaoi = new DaNaoi();
        DaNaoi.getByteValue(0);  //0
        DaNaoi.getByteValue(55);//55
        DaNaoi.getByteValue(128);//-128
        DaNaoi.getByteValue(255);//-1
        DaNaoi.getByteValue(256);//0
        DaNaoi.getByteValue(296);//40
    }
}
