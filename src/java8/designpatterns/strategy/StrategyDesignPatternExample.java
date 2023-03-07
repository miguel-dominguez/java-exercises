package java8.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

// Behavior design patter
public class StrategyDesignPatternExample {

  // Used when we have multiple solution or algorithms to solve a specific task and client decides tje specific implementation at runtime
  // Example: Comparator, we can sort the objects in different ways

  public static void main(String[] args) {
    List<Stock> elements = new ArrayList<>();
    elements.add(new Stock("APPL", 22.3, 21));
    elements.add(new Stock("NVD", 11.99, 34));
    elements.add(new Stock("MSFT", 30.7, 54));
    elements.add(new Stock("GOOGL", 5.47, 56));
    elements.add(new Stock("APPL", 14.6, 78));

    // FilterStock.bySymbol(elements, "APPL").forEach(System.out::println);
    // FilterStock.byPriceAbove(elements, 15).forEach(System.out::println);
    // FilterStock.filter(elements, stock -> stock.getValue() > 15).forEach(System.out::println);
    FilterStock.filter(elements, stock -> stock.getKey().equals("APPL")).forEach(System.out::println);
  }

}
