package com.lican.bubbleSort;

public class MonitorDemo {
    private int a = 0;
    public synchronized void writer(){
        a++;
    }

    public synchronized void reader(){
        int i = a;
    }
}
