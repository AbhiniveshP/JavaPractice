package com.codewithmosh.concurrency.bestpricefinder;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        var startTime = LocalTime.now();
        var flightService = new FlightService();
//        flightService.getQuoteAsync("SITE-1")
//            .thenAccept(System.out::println);
        var futures = flightService.getAllQuotesAsync()
            .map(future -> future.thenAccept(System.out::println))
            .collect(Collectors.toList());

        CompletableFuture
            .allOf(futures.toArray(new CompletableFuture[0]))
            .thenRun(() -> {
                var endTime = LocalTime.now();
                var duration = Duration.between(startTime, endTime).toMillis();
                System.out.println("Retrieved prices from all sites in " + duration + " ms.");
            });

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
