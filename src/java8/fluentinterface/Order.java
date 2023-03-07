package java8.fluentinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Order {

  private List<String> cart = new ArrayList<>();

  public Order() {
  }

  public Order(List<String> cart) {
    this.cart = cart;
  }

  public Order add(String item) {
    cart.add(item);
    System.out.println("Item " + item + " was added to the cart");
    return new Order(this.cart);
  }

  public static void place(Function<Order, Order> func) {
    Order order = new Order();
    order = func.apply(order);
    System.out.println("Your order was placed. Number of items = " + order.cart.size());
  }

}
