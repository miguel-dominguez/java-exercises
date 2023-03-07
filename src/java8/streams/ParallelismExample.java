package java8.streams;

import java8.streams.common.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class ParallelismExample {

  public static void main(String[] args) {

    // Computational intensive: Number of threads <= Number of cores
    // IO intensive: Number of threads > Number of cores

    System.out.println(Runtime.getRuntime().availableProcessors());
    System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");
    System.out.println(ForkJoinPool.getCommonPoolParallelism());
    ForkJoinPool p = new ForkJoinPool(2);

    List<Employee> list = new ArrayList<>();

    for (int i = 0; i < 100; i++){
      list.add(new Employee("John", 300));
      list.add(new Employee("Rocky", 100));
      list.add(new Employee("Charly", 200));
      list.add(new Employee("Elena", 500));
      list.add(new Employee("Martha", 600));
      list.add(new Employee("Trevor", 300));
    }

    try {
      long count = p.submit(() -> list.parallelStream().filter(e -> e.getSalary() > 200).count()).get();
      System.out.println(count);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }


  }

}
