package java8;

import java.time.Instant;

public class QuickTests {

  public static void main(String[] args) throws InterruptedException {
    Long initialTime = Instant.now().toEpochMilli();
    Thread.sleep(20);
    Long finalTime = Instant.now().toEpochMilli();
    System.out.println(finalTime - initialTime);
  }

}
