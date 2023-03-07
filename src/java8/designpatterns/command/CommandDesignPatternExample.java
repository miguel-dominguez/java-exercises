package java8.designpatterns.command;

// Behaviour Pattern
// Encapsulating request as an Object
// Example: Runnable
public class CommandDesignPatternExample {

  public static void main(String[] args) {

    AC ac1 = new AC();

    ACAutomationRemote remote = new ACAutomationRemote();
    remote.setCommand(() -> ac1.turnOn());
    remote.buttonPressed();

  }

}
