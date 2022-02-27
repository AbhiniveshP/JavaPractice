package com.codewithmosh.concurrency;

//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {

//    private AtomicInteger totalBytes = new AtomicInteger();
//    private Lock lock = new ReentrantLock();
//    private Object totalBytesLock = new Object();
    private LongAdder totalBytes = new LongAdder();
    private volatile boolean isDone;


    public void incrementTotalBytes() {
//        lock.lock();
//        synchronized (totalBytesLock){
//            totalBytes++;
//        }
//        totalBytes.incrementAndGet();   // ++a and not a++ here. this is for atomic object.
        totalBytes.increment();
//        finally {
////            lock.unlock();
//        }
    }

    public int getTotalBytes() {
//        return totalBytes.get();
        return totalBytes.intValue();
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
