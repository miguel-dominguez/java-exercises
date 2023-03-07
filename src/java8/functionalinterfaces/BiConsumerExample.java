package java8.functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + " b: " + b);
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> biConsumerMultiplication = (a, b) -> System.out.println("Multiplication is: " + (a*b));
        BiConsumer<Integer, Integer> biConsumerDivision = (a, b) -> System.out.println("Division is: " + (a/b));
        biConsumerMultiplication.andThen(biConsumerDivision).accept(10, 5);
    }

}
