package com.codewithmosh.concurrency;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading file:: " + Thread.currentThread().getName());

        // Making a thread pause
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
//        status.done();
//        synchronized (status) {
//            status.notifyAll();
//        }

        System.out.println("Download complete:: " + Thread.currentThread().getName());
    }
}
