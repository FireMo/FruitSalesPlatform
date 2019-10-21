package com.lican.bubbleSort;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ThreadPools {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "task 3";
            }
        });

        List<Future<String>> futures = executorService.invokeAll(callables);
        for (Future<String> future : futures){
            System.out.println("future get = " + future.get());
        }

//        String result = executorService.invokeAny(callables);
//        System.out.println("result = " + result);
        executorService.shutdown();
    }
}
