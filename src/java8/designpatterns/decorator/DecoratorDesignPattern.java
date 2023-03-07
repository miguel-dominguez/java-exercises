package java8.designpatterns.decorator;

// Structural design pattern
public class DecoratorDesignPattern {

  // Use to modify functionality of object without affecting other instances of the same class using composition and inheritance
  public static void main(String[] args) {
    /*
    Burger normal = new Burger();
    System.out.println(normal.toString());

    Burger veggie = new Burger();
    veggie.addVeggies();
    System.out.println(veggie.toString());

    Burger all = new Burger();
    all.addVeggies();
    all.addCheese();
    System.out.println(all.toString());
    */

    Burger order = new BurgerShop(burger -> burger.addVeggies()).use(new Burger());
    Burger order2 = new BurgerShop(b -> b.addCheese()).use(order);
    System.out.println(order2);
  }

}
