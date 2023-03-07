package java8.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> operation = (s) -> s.concat("-anotherString");

    public static void main(String[] args) {
        System.out.println(operation.apply("hey"));
    }

}
