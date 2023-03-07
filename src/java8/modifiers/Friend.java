package java8.modifiers;

public class Friend {

  private final String name;
  private static int numOfFriends;

  public Friend(String name) {
    this.name = name;
    numOfFriends++;
  }

  static void displayNumberOfFriends() {
    System.out.println("Total friends: " + numOfFriends);
  }

}
