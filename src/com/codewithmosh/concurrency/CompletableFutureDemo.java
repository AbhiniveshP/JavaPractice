package com.codewithmosh.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static CompletableFuture<String> getEmailAsync() {
        return CompletableFuture.supplyAsync( () -> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void main(String[] args) {
//        Supplier<Boolean> task = () -> true;
//        var future = CompletableFuture.supplyAsync(task);
//        try {
//            var result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
        var future = CompletableFuture.supplyAsync(() -> 10);
//        future.thenRun( () -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        });
//        future.thenRunAsync( () -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        });
//        future.thenAccept( result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });
//        future.thenAcceptAsync( result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });
//        future
//            .thenApply(CompletableFutureDemo::toFahrenheit)
//            .thenAccept(fahrenheit -> System.out.println(fahrenheit));
//        getEmailAsync()
//            .thenCompose( CompletableFutureDemo::getPlaylistAsync)
//            .thenAccept(playlist -> System.out.println(playlist));

//        var price = CompletableFuture
//            .supplyAsync( () -> "20USD")
//            .thenApply(priceAsStringWithCurrency -> {
//                var priceAsString = priceAsStringWithCurrency.replace("USD", "");
//                return Integer.parseInt(priceAsString);
//            });
//        var exchangeRate = CompletableFuture.supplyAsync( () -> 0.9 );
//
//        price
//            .thenCombine(exchangeRate, (p, e) -> p * e)
//            .thenAccept( finalPrice -> System.out.println(finalPrice) );

        var first = CompletableFuture.supplyAsync( () -> 1 );
        var second = CompletableFuture.supplyAsync( () -> 2 );
        var third = CompletableFuture.supplyAsync( () -> 3);
        var fourth = CompletableFuture.supplyAsync( () -> {
            LongTask.simulate();
            return 4;
        });

        CompletableFuture.allOf(first, second, third)
            .thenRun( () -> System.out.println("Successfully completed all 3 tasks..."));
        CompletableFuture.anyOf(second, fourth)
            .thenAccept( result -> System.out.println(result));
    }
}
