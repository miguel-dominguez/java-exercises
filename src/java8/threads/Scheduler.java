package java8.threads;

import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {

  public static void main(String[] args) throws InterruptedException {
    ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
    Runnable task1 = () -> System.out.println("Running task1...");
    task2();
    //run this task after 5 seconds, nonblock for task3
    ses.scheduleAtFixedRate(task1, 5, 1, TimeUnit.SECONDS);
    task3();
    ses.shutdown();
  }

  public static void task2() {
    System.out.println("Running task2...");
  }

  public static void task3() throws InterruptedException {
    Thread.sleep(100000);
    System.out.println("Running task3...");
  }


}
