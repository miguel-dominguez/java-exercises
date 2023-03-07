package java8.streams;

import java8.streams.common.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

  public static void main(String[] args) {
    List<Book> books = initializeBooks();
    // filter operation
    System.out.println(books.stream().filter(book -> book.getPrice() < 10).collect(Collectors.toList()));
    books.stream().filter(book -> book.getRating() > 3).forEach(System.out::println);
    // map operation
    List<String> authors = books.stream().map(b -> b.getAuthor()).collect(Collectors.toList());
    System.out.println(authors);
    // reduce operation
    System.out.println(Stream.of(1, 2, 34, 45, 56, 53, 21, 67, 23, 78).reduce(0, (a, b) -> a + b).intValue());
  }

  private static List<Book> initializeBooks() {
    List<Book> allBooks = new ArrayList<>();
    allBooks.add(new Book("1", "some title", "author 1", 11.90, 3));
    allBooks.add(new Book("2", "little prince", "someone", 6.70, 1));
    allBooks.add(new Book("3", "farenheit 451", "ray bradbury", 10.30, 5));
    allBooks.add(new Book("4", "bill gates biography", "bill gates", 4.88, 4));
    allBooks.add(new Book("5", "steve jobs biography", "steve jobs", 7.25, 2));
    return allBooks;
  }

}
