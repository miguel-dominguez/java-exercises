package java8.collections;

import java8.collections.common.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionExercises {

  public static void main(String[] args) {
    forLoopOverEmptyList();
  }

  public void mergeMaps() {
    HashMap<String, String> mapA = new HashMap<>();
    mapA.put("1", "1");
    mapA.put("2", "2");
    mapA.put("3", "3");

    System.out.println(mapA);

    HashMap<String, String> mapB = new HashMap<>();
    mapB.put("1", "G");
    mapB.put("4", "D");

    mapA.putAll(mapB);

    System.out.println("-------");
    System.out.println(mapA);
  }

  public static void forLoopOverEmptyList() {
    List<Person> persons = new ArrayList<>();
    for(Person person: persons) {
      System.out.println("found something");
    }
    System.out.println("end");
  }


}
