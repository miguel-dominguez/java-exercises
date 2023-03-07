package java8.functionalinterfaces;

import java8.functionalinterfaces.data.Student;
import java8.functionalinterfaces.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
    static Consumer<Student> c2 = (s) -> System.out.println(s);
    static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());

    public static void main(String[] args) {
        printName();
    }

    // Uses only one consumer
    public static void printName() {
        System.out.println("printName:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2);
    }

    // This method uses consumer chaining
    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c3.andThen(c4));
    }

    // This method uses consumer chaining
    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if (student.getGradeLevel() >= 3) c3.andThen(c4).accept(student);
        });
    }

}
