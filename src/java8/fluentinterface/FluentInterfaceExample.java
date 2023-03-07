package java8.fluentinterface;

public class FluentInterfaceExample {

  public static void main(String[] args) {

    Order.place(order -> order.add("item1").add("item2").add("item3"));

  }

}
