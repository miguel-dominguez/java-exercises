package java8.modifiers;

public class Outer {

  public void sayHelloOuter() {
    System.out.println("hello from outer class!");
  }

  public static class Inner {
    public void sayHelloInner() {
      System.out.println("hello from inner class!");
    }
  }

}
