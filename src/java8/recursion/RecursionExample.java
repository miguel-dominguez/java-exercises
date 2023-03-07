package java8.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionExample {

  public static void main(String[] args) {
    Command c20 = new Command("20", new ArrayList<>());
    Command c8 = new Command("8", new ArrayList<>());
    Command c7 = new Command("7", new ArrayList<>());
    Command c6 = new Command("6", Arrays.asList(c7, c8));
    Command c5 = new Command("5", new ArrayList<>());
    Command c4 = new Command("4", Arrays.asList(c6));
    Command c3 = new Command("3", Arrays.asList(c5));
    Command c2 = new Command("2", Arrays.asList(c3, c4));
    Command c1 = new Command("1", Arrays.asList(c2, c20));
    endDependentCommands(c1);
  }

  private static void endDependentCommands(Command command) {
    List<Command> dependentCommands = getAllDependentCommands(command);
    System.out.println(dependentCommands);
  }

  public static List<Command> getAllDependentCommands(Command command){
    List<Command> allCommands = new ArrayList<>();
    allCommands.addAll(command.getDependentCommands());
    for (int i=0; i < allCommands.size(); i++) {
      Command c = allCommands.get(i);
      for(Command cmd : c.getDependentCommands()) {
        if (!allCommands.contains(cmd)) {
          allCommands.add(cmd);
        }
      }
    }
    return allCommands;
  }

}
