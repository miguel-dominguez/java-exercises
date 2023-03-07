package java8.functionalinterfaces;

import java8.functionalinterfaces.data.Student;
import java8.functionalinterfaces.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bifunction = (students, predicate) -> {
        Map<String, Double> results = new HashMap<>();
        students.forEach(student -> {
            if(predicate.test(student)) results.put(student.getName(), student.getGpa());
        });
        return results;
    };

    public static void main(String[] args) {
        System.out.println(bifunction.apply(StudentDataBase.getAllStudents(), p2));
    }

}
