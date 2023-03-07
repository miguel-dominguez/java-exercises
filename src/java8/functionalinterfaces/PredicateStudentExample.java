package java8.functionalinterfaces;

import java8.functionalinterfaces.data.Student;
import java8.functionalinterfaces.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        System.out.println("Grade more than 3");
        filterStudentByGrade();
        System.out.println("GPA more than 3.9");
        filterStudentByGpa();
        System.out.println("Grade grater than 3 and GPA grater than 3.9");
        filterStudentByGradeAndGpa();
    }

    public static void filterStudentByGrade() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if(p1.test(student)) System.out.println(student);
        }));
    }

    public static void filterStudentByGpa() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if(p2.test(student)) System.out.println(student);
        }));
    }

    public static void filterStudentByGradeAndGpa() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if(p1.and(p2).test(student)) System.out.println(student);
        }));
    }

}
