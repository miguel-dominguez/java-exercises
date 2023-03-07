package java8.designpatterns.builder;

import javax.print.DocFlavor;

// Flexibility in Object creation
// A lot of arguments or setters
// Isolate the construction of complex Objects
public class BuilderDesignPatternExample {

  public static void main(String[] args) {
    // Example: StringBuilder
    StringBuilder str = new StringBuilder();
    str.append("hello ");
    str.append("world ");
    System.out.println(str);

    MobileBuilder builder = new MobileBuilder();
    Mobile mobile = builder.with(myBuilder -> {
      myBuilder.ram = 4;
      myBuilder.battery = 4000;
      myBuilder.processor = "A12 Bionic";
    }).createMobile();
    System.out.println(mobile);
  }

}
