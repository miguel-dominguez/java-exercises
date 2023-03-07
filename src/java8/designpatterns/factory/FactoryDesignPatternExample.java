package java8.designpatterns.factory;

import java.util.Calendar;

// Creational pattern
// Creating objects without exposing instantiation logic
// Factory is an object tjhat is able to create other objects
public class FactoryDesignPatternExample {

  public static void main(String[] args) {
    // Example Calendar class
    // Calendar cal = Calendar.getInstance();
    // System.out.println(cal); // java.util.GregorianCalendar = concrete

    Flooring flooring1 = FlooringFactory.getFlooring(-4, 18);
    Flooring flooring2 = FlooringFactory.getFlooring(3, 78);
    Flooring flooring3 = FlooringFactory.getFlooring(7, 18);

    System.out.println(flooring1);
    System.out.println(flooring2);
    System.out.println(flooring3);

  }

}
