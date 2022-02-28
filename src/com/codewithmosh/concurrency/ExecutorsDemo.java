package com.codewithmosh.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);
        try {
            var future = executor.submit( () -> {
                System.out.println(Thread.currentThread().getName());
                LongTask.simulate();
                return true;
            } );

            System.out.println("Do more work!!!");

            try {
                var result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        finally {
            executor.shutdown();
        }
    }
}
