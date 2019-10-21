package com.lican.bubbleSort;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockedQueue<E> {
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    //队列属性
    private Object[] items;
    private volatile int count = 0;
    private MyBlockedQueue(int size){
        items = new Object[size];
    }

    public void put(Object obj) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length){
                System.out.println("队列已满，无法继续放入元素");
                notFull.await();
            }
            items[count++] = obj;
            System.out.println("放入元素");
            System.out.println("此时队列的长度为" + size());
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException{
        lock.lock();
        Object obj;
        try {
            while (true){
                if (count == 0){
                    System.out.println("队列为空，无元素可取");
                    notEmpty.await();
                }
                obj = items[--count];
                System.out.println("取出元素");
                System.out.println("此时队列元素个数为：" + size());
                notFull.signal();
                return obj;
            }
        }finally {
            lock.unlock();
        }
    }

    public int size(){
        return this.count;
    }

    public static void main(String[] args) throws InterruptedException {
        final MyBlockedQueue<Object> queue = new MyBlockedQueue<Object>(10);
        final Random r = new Random();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true){
                        queue.take();
                        Thread.sleep(r.nextInt(900));
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true){
                        queue.put(1);
                        Thread.sleep(r.nextInt(1000));
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }

}
