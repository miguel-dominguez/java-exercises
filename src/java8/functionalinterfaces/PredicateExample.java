package java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = (i) -> i % 2 == 0;
    static Predicate<Integer> p2 = (i) -> i % 5 == 0;

    public static void main(String[] args) {
        System.out.println(p1.test(4));
        System.out.println(p2.test(3));
        // predicate chaining
        // and
        System.out.println("and: " + p1.and(p2).test(10));
        System.out.println("and: " + p1.and(p2).test(6));
        // or
        System.out.println("or: " + p1.or(p2).test(8));
        System.out.println("or: " + p1.or(p2).test(9));
        // negate
        System.out.println("negate: " + p1.or(p2).negate().test(8));
    }



}
