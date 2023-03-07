package java8.modifiers;

public class StaticModifierExample {

  public static void main(String[] args) {

    // Class Friend has static variable numOfFriends
    Friend f1 = new Friend("Alex");
    Friend f2 = new Friend("Martha");
    Friend f3 = new Friend("Peter");

    // This line is going to display the total of friends created, the value is the same for all the instances.
    Friend.displayNumberOfFriends();

    // Math class methods are the simplest examples of how to use a static method
    System.out.println(Math.abs(-1));

    // You can use static class just for inner classes
    Outer outer = new Outer();
    outer.sayHelloOuter();
    Outer.Inner inner = new Outer.Inner();
    inner.sayHelloInner();

  }

}
