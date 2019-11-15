package homework_11.task_9;

import java.util.Objects;

/*Task 9
        Есть TreeSet<Student>. Заполните его списком студентов. Если получили исключение, вспомните про интерфейс Comparable или Comparator*/
public class Student implements Comparable<Student> {
    private String name;
    private String faculty;

    public Student(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                faculty.equals(student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty);
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.faculty.compareTo(o.faculty);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
