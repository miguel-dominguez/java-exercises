package java8.functionalinterfaces;

import java8.functionalinterfaces.data.Student;
import java8.functionalinterfaces.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println("name: "+name+" activities: "+activities);

    Consumer<Student> studentConsumer = (student -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())) studentBiConsumer.accept(student.getName(), student.getActivities());
    });

    public void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(students);
    }

}
