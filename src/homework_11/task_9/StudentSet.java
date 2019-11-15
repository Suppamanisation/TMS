package homework_11.task_9;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("Petya", "Biology"));
        studentSet.add(new Student("Vasya", "Biology"));
        studentSet.add(new Student("Katya", "Mathematics"));
        studentSet.add(new Student("Masha", "Geography"));
        studentSet.add(new Student("Petya", "Law"));
        studentSet.add(new Student("Petya", "Biology"));
        System.out.println(studentSet);
    }
}
