package com.codewithmosh.concurrency;

public class GenericDemo {

    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.sendAsync();
        System.out.println("Hello World!"); // if process ends here, though mailService runs async on separate thread,
                                            // it won't print MailService messages and so make this main thread sleep.

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
