package java8.designpatterns.decorator;

public class Burger {

  private String burgerType;

  public Burger() {
    this.burgerType = "";
  }

  private Burger(String burgerType) {
    this.burgerType = burgerType;
  }

  public Burger addVeggies() {
    return new Burger(this.burgerType += " Veggie");
  }

  public Burger addCheese() {
    return new Burger(this.burgerType += " Cheese");
  }

  @Override
  public String toString() {
    return String.format("%s", burgerType + " burger");
  }

}
