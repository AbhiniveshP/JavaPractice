package com.designpatterns.template;

public class Demo {

    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();
        Task task2 = new GenerateReportTask();
        task2.execute();

        Window window1 = new NoOpWindow();
        window1.close();
        Window window2 = new ClearScreenWindow();
        window2.close();
    }
}
