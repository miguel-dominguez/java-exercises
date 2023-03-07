package java8.matcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

  public static void main(String[] args) {
    String expression = "\\$\\.(?<temporaryId>[^\\.]+)\\.result\\.(?<property>resourceId|revisionId)";
    Pattern pattern = Pattern.compile(expression);
    String input = "{\"id\": \"$.commandEid1.result.resourceId\", \"name\": \"some name\", \"id\": \"$.commandEid2.result.revisionId\", \"name\": \"other name\", \"id\": \"$.commandEid3.result.resourceId\", \"name\": \"3rd name\"}";
    Matcher matcher = pattern.matcher(input);

    Map<String, Command> commands = new HashMap<>();
    commands.put("commandEid1", new Command("someId1", "resource1", "revision1"));
    commands.put("commandEid2", new Command("someId2", "resource2", "revision2"));
    commands.put("commandEid3", new Command("someId3", "resource3", "revision3"));

    /*List<Command> commands = new ArrayList<>();
    commands.add(new Command("commandEid1", "resource1", "revision1"));
    commands.add(new Command("commandEid2", "resource1", "revision1"));
    commands.add(new Command("commandEidX", "resource1", "revision1"));*/

    while (matcher.find()) {
      String match = matcher.group();
      System.out.println("match="+match);
      for (Map.Entry<String, Command> entry : commands.entrySet()) {
        if (match.contains(entry.getKey())) {
          String newValue = match;
          if (matcher.group("property").equals("revisionId")) {
            newValue = entry.getValue().getRevisionId();
          }
          if (matcher.group("property").equals("resourceId")) {
            newValue = entry.getValue().getResourceId();
          }
          input = input.replace(match, newValue);
        }
      }
      /*for (Command c: commands) {
        if (match.contains(c.getId())) {
          String newValue = match;
          if (matcher.group("property").equals("revisionId")) newValue = c.getRevisionId();
          if (matcher.group("property").equals("resourceId")) newValue = c.getResourceId();
          input = input.replace(match, newValue);
        }
      }*/
    }

    System.out.println("------------------");
    System.out.println(input);

  }


  /*
  public static void main(String[] args) {
    String expression = "\\$\\.(?<temporaryId>[^\\.]+)\\.result\\.(?<property>resourceId|revisionId)";
    Pattern pattern = Pattern.compile(expression);
    String input = "{\"id\": \"$.commandEid1.result.resourceId\", \"name\": \"some name\", \"id\": \"$.commandEid2.result.resourceId\", \"name\": \"other name\", \"id\": \"$.commandEid3.result.resourceId\", \"name\": \"3rd name\"}";
    Matcher matcher = pattern.matcher(input);
    Map<String, String> matches = new HashMap<>();

    String idToMatch = "commandEid2";
    String newValue = "XYZ";

    while (matcher.find()) {
      String match = matcher.group();
      System.out.println("match="+match);
      if (match.contains(idToMatch)) {
        input = input.replace(match, newValue);
      }
    }

    System.out.println("----");
    System.out.println(input);

  }
  */

}
