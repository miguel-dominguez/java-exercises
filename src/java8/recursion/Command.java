package java8.recursion;

import java.util.List;

public class Command {

  String id;
  List<Command> dependentCommands;

  public Command(String id) {
    this.id = id;
  }

  public Command(String id, List<Command> dependentCommands) {
    this.id = id;
    this.dependentCommands = dependentCommands;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Command> getDependentCommands() {
    return dependentCommands;
  }

  public void setDependentCommands(List<Command> dependentCommands) {
    this.dependentCommands = dependentCommands;
  }

  @Override
  public String toString() {
    return "Command{" +
            "id='" + id + '\'' +
            '}';
  }

}
