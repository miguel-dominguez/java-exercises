package java8.streams;

import java8.streams.common.Employee;

import java.util.ArrayList;
import java.util.List;

// Parallelism is for speed
public class ParallelStreamsExample {

  public static void main(String[] args) {
    // Streams can be treated as sequential or parallel

    long startTime;
    long endTime;
    long count;

    List<Employee> list = new ArrayList<>();

    for (int i = 0; i < 100; i++){
      list.add(new Employee("John", 300));
      list.add(new Employee("Rocky", 100));
      list.add(new Employee("Charly", 200));
      list.add(new Employee("Elena", 500));
      list.add(new Employee("Martha", 600));
      list.add(new Employee("Trevor", 300));
    }

    startTime = System.currentTimeMillis();
    count = list.stream().filter(e -> e.getSalary() > 200).count();
    endTime = System.currentTimeMillis();
    System.out.println("Sequentially: " + endTime);
    System.out.println("Sequentially: " + startTime);
    System.out.println("Sequentially: " + (endTime - startTime));

    startTime = System.currentTimeMillis();
    count = list.parallelStream().filter(e -> e.getSalary() > 200).count();
    endTime = System.currentTimeMillis();
    System.out.println("Parallel: " + endTime);
    System.out.println("Parallel: " + startTime);
    System.out.println("Parallel: " + (endTime - startTime));

  }

}
