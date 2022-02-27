package com.codewithmosh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreamsDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        // Any collection implements stream() functionality,
        // but stream() on an array is done in the below manner.
        Arrays.stream(numbers)
            .forEach( num -> System.out.print(num + "\t") );
        System.out.println();

        var stream = Stream.generate( () -> Math.random() );    // this generates an infinite stream.
        stream
            .limit(5)
            .forEach( num -> System.out.print(num + "\t") );     // this limits stream from infinite to only 5 numbers.
        System.out.println();

        Stream.iterate(1, n -> n + 1)                           // iterate() also generates infinite stream.
            .limit(10)                                            // it takes a seed as first arg (initial value)
            .forEach(num -> System.out.print(num + "\t"));        // UnaryOperator as second arg (to continue from seed).
        System.out.println();

        // Mapping example
        var movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );

        movies.stream()
            .map(movie -> movie.getTitle())
            .forEach(movieTitle -> System.out.print(movieTitle + "\t"));
        System.out.println();

        // FlatMap example
        var streamOfLists = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        streamOfLists
            .flatMap(list -> list.stream())
            .forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // Filter example
        movies.stream()
            .filter(movie -> movie.getLikes() > 10)
            .forEach(movie -> System.out.print(movie.getTitle() + "\t"));
        System.out.println();

        // Slicing examples
        movies.stream()
            .skip(2)
            .limit(1)
            .forEach(m -> System.out.println(m.getTitle()));    // takeWhile() & dropWhile() also work similarly.

        // Sorted stream
        movies.stream()
            .sorted( (m1, m2) -> m1.getTitle().compareTo(m2.getTitle()))    // this can be replaced with Comparator.comparing
            .forEach(movie -> System.out.print(movie.getTitle() + "\t"));
        System.out.println();

        // Unique elements
        movies.stream()
            .map(Movie::getLikes)
            .distinct()
            .forEach(System.out::print);
        System.out.println();

        // Reducer examples (Terminal operations)
        var countResult = movies.stream()
            .count();
        System.out.println("Count:: " + countResult);

        var anyMatch = movies.stream()
            .anyMatch(movie -> movie.getLikes() > 20);
        System.out.println("AnyMatch:: " + anyMatch);   // Similarly allMatch()

        Optional<Integer> totalLikes = movies.stream()
            .map(movie -> movie.getLikes())
            .reduce( (a, b) -> a + b );
        System.out.println("ReduceWithAccumulator:: " + totalLikes.orElse(0));

        // Collectors
        var collectedList = movies.stream()
            .filter(movie -> movie.getLikes() > 10)
            .collect(Collectors.toList());

        var collectedMap = movies.stream()
            .filter(movie -> movie.getLikes() > 10)
            .collect(Collectors.toMap(Movie::getTitle, Movie::getTitle));




    }
}
