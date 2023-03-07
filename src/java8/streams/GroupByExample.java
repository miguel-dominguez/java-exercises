package java8.streams;

import java8.streams.common.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

  public static void main(String[] args) {
    List<Employee> employees = List.of(
            new Employee("A", 12),
            new Employee("B", 6),
            new Employee("C", 7),
            new Employee("A", 8),
            new Employee("A", 6),
            new Employee("T", 3),
            new Employee("R", 12)
    );

    //Map<String, List<Double>> result = employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getSalary, Collectors.toList())));
    //System.out.println(result);

    //Map<String, List<Employee>> result2 = employees.stream().collect(Collectors.groupingBy(Employee::getName));
    //System.out.println(result2);

    List<String> origin = new ArrayList<>();
    origin.add("A");
    origin.add("B");
    origin.add("C");
    origin.add("A");
    origin.add("A");
    origin.add("A");

    List<String> source = new ArrayList<>();
    source.add("A");

    origin.removeIf(e -> source.contains(e));

    origin.forEach(System.out::println);

  }

}
