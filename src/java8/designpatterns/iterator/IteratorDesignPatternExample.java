package java8.designpatterns.iterator;

import java8.designpatterns.iterator.MyArrayList;

// Behaviour design pattern
// Accessing elements without exposing internal structure
public class IteratorDesignPatternExample {

  // Does not matter if we need to iterate a list or a set
  // Example: Iterator and Enumeration

  // Object Oriented Style
  // class MyContainer implements Iterable<String>

  // Functional Style

  public static void main(String[] args) {
    MyArrayList list = new MyArrayList(new Object[]{1, 2, 3, 4, 5});
    list.forEach(System.out::println);
  }



}
