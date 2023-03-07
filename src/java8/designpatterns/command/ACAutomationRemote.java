package java8.designpatterns.command;


public class ACAutomationRemote {

  Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void buttonPressed() {
    command.execute();
  }

}
