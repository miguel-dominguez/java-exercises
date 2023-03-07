package java8.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalConcepts {

  public static void main(String[] args) {
    functionChaining();
    functionComposition();
    functionCurrying();
  }

  public static void functionChaining() {
    System.out.println("Function chaining: ");
    Consumer<String> con1 = (s) -> System.out.println(s);
    Consumer<String> con2 = (s) -> System.out.println(s.toUpperCase());
    con1.accept("hello");
    con2.accept("World");
    con1.andThen(con2);
  }

  public static void functionComposition() {
    System.out.println("Function composition");
    Function<Integer, Integer> duplicate = (number) -> number * 2;
    Function<Integer, Integer> addTen = (number) -> number + 10;
    System.out.println("First duplicate then add 10 to 5: " + duplicate.andThen(addTen).apply(5));
    System.out.println("First add 10 and then duplicate to 5: " + duplicate.compose(addTen).apply(5));
  }

  public static void functionCurrying() {
    Function<Integer, Function<Integer, Function<Integer, Integer>>> addition = (x) -> y -> z -> x + y + z;
    System.out.println(addition.apply(1).apply(2).apply(3));
  }



}
