package com.codewithmosh.lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {

    public static void main(String[] args) {
        greet( message -> System.out.println(message));

        // Consumer interface
        List<Integer> list = List.of(1, 2, 3);
        list.forEach(System.out::println);  // Short form of list.forEach( item -> System.out.println(item) );

        // Consumer chaining
        List<String> listOfStrings = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        listOfStrings.forEach(print.andThen(printUpperCase).andThen(print));

        // Supplier interface
        Supplier<Integer> getRandom = () -> (int) (Math.random() * 100);
        var value = getRandom.get();
        System.out.println("Random Value - Supplier Interface:: " + value);

        // Function interface
        Function<String, Integer> mapper = string -> string.length();
        var length = mapper.apply("Abhinivesh");
        System.out.println("String Mapper - Function Interface:: " + length);

        // Composing Functions
        // "key:value"
        // first: "key=value"
        // second: "{key=value}"
        Function<String, String> replaceColon = string -> string.replace(":", "=");
        Function<String, String> addBraces = string -> "{" + string + "}";

        var result = replaceColon.andThen(addBraces).apply("Key:Value");
        System.out.println("Compose Functions - Using andThen:: " + result);

        result = addBraces.compose(replaceColon).apply("Key2:Value2");
        System.out.println("Compose Functions - Using compose:: " + result);

        // Predicate Interface
        // "sky" -> has > 5 chars?
        Predicate<String> isLongerThan5 = string -> string.length() > 5;
        System.out.println("Predicate Interface:: " + isLongerThan5.test("sky"));

        // Combining Predicates
        Predicate<String> hasLeftBrace = s -> s.startsWith("{");
        Predicate<String> hasRightBrace = s -> s.endsWith("}");
        System.out.println(hasLeftBrace.and(hasRightBrace).test("{key:value}"));
        System.out.println(hasLeftBrace.or(hasRightBrace).test("{k:v"));
        System.out.println(hasLeftBrace.negate().test("k"));

        // Binary & Unary Operators
        BinaryOperator<Integer> add = (a, b) -> a + b;
        var adder = add.apply(1, 2);
        UnaryOperator<Integer> square = a -> a * a;
        var squared = add.andThen(square).apply(2, 3);
        System.out.println("Binary+Unary Operator:: " + squared);

    }

    public static void greet(Printer printer) {
        printer.print("Hello Abhi!");
    }
}
