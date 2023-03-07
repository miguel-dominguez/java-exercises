package java8.imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {
        List<Integer> intergerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);

        // Imperative
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer integer: intergerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println(uniqueList);

        // Declarative
        List<Integer> uniqueList1 = intergerList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList1);
    }

}
