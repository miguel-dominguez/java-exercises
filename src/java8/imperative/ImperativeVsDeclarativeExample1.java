package java8.imperative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        // Imperative - how style of programming
        int sum = 0;
        for(int i=0; i<=100; i++){
            sum+=i;
        }
        System.out.println(sum);

        // Declarative - Style of programming
        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println(sum1);

        // Declarative using filter
        int sum2 = IntStream.rangeClosed(0,100).filter(x -> x % 2 == 0).sum();
        System.out.println(sum2);

    }

}
