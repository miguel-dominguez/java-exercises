package java8.designpatterns.strategy;

public class Stock {

  private String key;
  private double value;
  private Integer numberOfPurchase;

  public Stock(String key, double value, Integer numberOfPurchase) {
    this.key = key;
    this.value = value;
    this.numberOfPurchase = numberOfPurchase;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public Integer getNumberOfPurchase() {
    return numberOfPurchase;
  }

  public void setNumberOfPurchase(Integer numberOfPurchase) {
    this.numberOfPurchase = numberOfPurchase;
  }

  @Override
  public String toString() {
    return "Stock{" +
            "key='" + key + '\'' +
            ", value=" + value +
            ", numberOfPurchase=" + numberOfPurchase +
            '}';
  }

}
