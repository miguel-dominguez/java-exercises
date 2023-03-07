package java8.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Double> operation = (a, b) -> a * b;
    static Comparator<Double> comparator = (a, b) -> a.compareTo(b);


    public static void main(String[] args) {
        System.out.println(operation.apply(3.4, 3.2));
        BinaryOperator<Double> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(3.4, 3.5));
    }

}
