package udemymasterclass.multithreading;



public class MyThread extends Thread {

    MyThread(String name) {
        this.setName(name);
    }

    public void run() {
        System.out.println("My Thread running: " + getName());
    }

    public static void main(String[] args) {
        // Thread 1
        MyThread myThread = new MyThread("Abhinivesh Thread");
        myThread.start();

        // Thread 2
        Thread anonymousThread = new Thread("Anonymous Thread") {
            public void run() {
                System.out.println("Anonymous Thread running: " + getName());
            }
        };

        anonymousThread.start();
        System.out.println(anonymousThread.getName());

        // Thread 3
        Runnable runnable = () -> {
            System.out.println("Lambda running Runnable");
        };

        Thread runnableThread = new Thread(runnable, "Runnable Thread");
        runnableThread.start();
        System.out.println(runnableThread.getName());

        // Multiple Threads
        System.out.println("Main Thread Running: " + Thread.currentThread().getName());
        for(int i = 0; i < 10; i++) {
            new Thread("" + i) {
              public void run() {
                  System.out.println("Currently running Thread number: " + getName());
              }
            }.start();
        }

    }
}
