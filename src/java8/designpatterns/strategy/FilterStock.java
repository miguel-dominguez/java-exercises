package java8.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterStock {

  public static List<Stock> bySymbol(List<Stock> original, String symbol) {
    List<Stock> filtered =  new ArrayList<>();
    for (Stock s: original) {
      if(s.getKey().equals(symbol)) filtered.add(s);
    }
    return filtered;
  }

  public static List<Stock> byPriceAbove(List<Stock> original, double price) {
    List<Stock> filtered =  new ArrayList<>();
    for (Stock s: original) {
      if(s.getValue() > price) filtered.add(s);
    }
    return filtered;
  }

  public static List<Stock> filter(List<Stock> original, Predicate<Stock> p) {
    List<Stock> filtered =  new ArrayList<>();
    for (Stock s: original) {
      if(p.test(s)) filtered.add(s);
    }
    return filtered;
  }

}
