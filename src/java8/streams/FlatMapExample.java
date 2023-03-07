package java8.streams;

import java.nio.file.Files;
import java.util.stream.Stream;

public class FlatMapExample {

  public static void main(String[] args) {
    Stream<String> a = Stream.of("Hello ", "there! ");
    Stream<String> b = Stream.of("Learning ", "Java? ");
    Stream<Stream<String>> of = Stream.of(a, b);
    of.flatMap(e -> e).forEach(System.out::println);
  }

}
