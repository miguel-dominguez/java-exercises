package java8.designpatterns.decorator;

import java.util.function.Function;

public class BurgerShop {

  private Function<Burger, Burger> decoration;

  public BurgerShop(Function<Burger, Burger> decoration) {
    this.decoration = decoration;
  }

  public Burger use(Burger baseBurger) {
    System.out.println("BaseBurger: " + baseBurger);
    return decoration.apply(baseBurger);
  }

}
