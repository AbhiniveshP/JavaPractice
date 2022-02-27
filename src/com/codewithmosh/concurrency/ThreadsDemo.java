package com.codewithmosh.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadsDemo {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.activeCount());                       // number of threads in this program
//        System.out.println(Runtime.getRuntime().availableProcessors()); // number of processors available.

        // Create a Thread
//        System.out.println(Thread.currentThread().getName());
//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();

        // Create multiple threads
//        for (int i = 0; i < 10; i++) {
//            Thread loopThread = new Thread(new DownloadFileTask());
//            loopThread.start();
//        }
        // Making a thread join
//        thread.join();  // This makes the other main thread wait until this thread completes its execution.
//        System.out.println("File is ready to be scanned");

        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread: threads) {
            thread.join();
        }

//        var thread1 = new Thread(new DownloadFileTask(status));
//        var thread2 = new Thread( () -> {
//           while(!status.isDone()) {
//               synchronized (status) {
//                   try {
//                       status.wait();
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//               }
//           }
//            System.out.println(status.getTotalBytes());
//        });
//
//        thread1.start();
//        thread2.start();

        System.out.println(status.getTotalBytes());

        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread1 = new Thread( () -> {
           collection.addAll(Arrays.asList(1, 2, 3));
        });
        Thread thread2 = new Thread( () -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println(collection);

        Map<Integer, String> map = new ConcurrentHashMap<>();   // thread-safe!!!
        map.put(1, "a");
        map.get(1);
        map.remove(1);
    }
}
