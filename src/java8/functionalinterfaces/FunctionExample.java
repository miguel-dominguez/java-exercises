package java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> toUpper = (name) -> name.toUpperCase();
    static Function<String, String> addString = (name) -> name.concat("-anotherString");

    public static void main(String[] args) {
        System.out.println("1st Result is: " + toUpper.apply("example"));
        System.out.println("2nd Result is: " + toUpper.andThen(addString).apply("example"));
        System.out.println("3rd Result is: " + toUpper.compose(addString).apply("example"));
    }

}
