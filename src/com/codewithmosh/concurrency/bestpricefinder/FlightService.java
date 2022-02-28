package com.codewithmosh.concurrency.bestpricefinder;

import com.codewithmosh.concurrency.LongTask;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {

    public Stream<CompletableFuture<Quote>> getAllQuotesAsync() {
        var sites = List.of("SITE-1", "SITE-2", "SITE-3");
        return sites.stream().map(this::getQuoteAsync);
    }

    public CompletableFuture<Quote> getQuoteAsync(String site) {
        return CompletableFuture.supplyAsync( () -> {
            System.out.println("Getting a quote from:: " + site);
            var random = new Random();
            var price = 100 + random.nextInt(20);
            LongTask.simulate(1000 + random.nextInt(2000));
            return new Quote(site, price);
        });
    }
}
