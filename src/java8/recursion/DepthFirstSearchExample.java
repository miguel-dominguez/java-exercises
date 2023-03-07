package java8.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearchExample {

  public static void main(String[] args) {
    testCyclicGraph();
    testAnotherCyclicGraph();
    testAcyclicGraph();
  }

  public static boolean isCyclic(List<Command> commands) {
    List<String> visited = new ArrayList<>();
    for (Command c: commands) {
      visited.add(c.getId());
      List<Command> dependents = c.getDependentCommands();
      for (Command d: dependents) {
        if (visited.contains(d.getId()))
          return true;
        else
          visited.add(c.getId());
      }
    }
    return false;
  }

  public static void testCyclicGraph() {
    Command c1 = new Command("1");
    Command c2 = new Command("2");
    Command c3 = new Command("3");
    c1.setDependentCommands(Arrays.asList(c3));
    c2.setDependentCommands(Arrays.asList(c1));
    c3.setDependentCommands(Arrays.asList(c2));
    List allCommands = Arrays.asList(c1, c2, c3);
    System.out.println(isCyclic(allCommands));
  }

  public static void testAnotherCyclicGraph() {
    Command c20 = new Command("20", new ArrayList<>());
    Command c8 = new Command("8", new ArrayList<>());
    Command c7 = new Command("7");
    Command c6 = new Command("6", Arrays.asList(c7, c8));
    Command c5 = new Command("5", new ArrayList<>());
    Command c4 = new Command("4", Arrays.asList(c6));
    Command c3 = new Command("3", Arrays.asList(c5));
    Command c2 = new Command("2", Arrays.asList(c3, c4));
    Command c1 = new Command("1", Arrays.asList(c2, c20));
    c7.setDependentCommands(Arrays.asList(c1));
    List allCommands = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c20);
    System.out.println(isCyclic(allCommands));
  }

  public static void testAcyclicGraph() {
    Command c20 = new Command("20", new ArrayList<>());
    Command c8 = new Command("8", new ArrayList<>());
    Command c7 = new Command("7", new ArrayList<>());
    Command c6 = new Command("6", Arrays.asList(c7, c8));
    Command c5 = new Command("5", new ArrayList<>());
    Command c4 = new Command("4", Arrays.asList(c6));
    Command c3 = new Command("3", Arrays.asList(c5));
    Command c2 = new Command("2", Arrays.asList(c3, c4));
    Command c1 = new Command("1", Arrays.asList(c2, c20));
    List allCommands = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c20);
    System.out.println(isCyclic(allCommands));
  }


}
