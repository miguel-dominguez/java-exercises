package java8.collections;

import java8.collections.common.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectCollectionExample {

  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Lucas", 21));
    persons.add(new Person("Max", 18));
    persons.add(new Person("Dustin", 22));
    persons.add(new Person("Mike", 20));

    persons.forEach(p -> p.setAge(20));

    System.out.println(persons);

    List<Person> friends = new ArrayList<>();
    friends.add(new Person("Lucas", 21));
    friends.add(new Person("Max", 18));
    friends.add(new Person("Dustin", 22));
    friends.add(new Person("Mike", 20));

    var newFriends = friends.stream().map(f -> {
      f.setAge(1);
      return f;
    }).collect(Collectors.toList());

    // Until the collect call, friends is not going to change the values of its elements
    System.out.println(friends);
    System.out.println(newFriends);

  }

}
