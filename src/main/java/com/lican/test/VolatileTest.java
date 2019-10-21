package com.lican.test;

public class VolatileTest extends Thread {
    volatile boolean flag = false;
    int i = 0;

    public void run() {
        while (!flag){
            i++;
        }
    }

    public static void main(String[] args) {
        VolatileTest vt = new VolatileTest();
        vt.start();
        try {
            Thread.sleep(2000);
            vt.flag = true;
            System.out.println("stop:" + vt.i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
