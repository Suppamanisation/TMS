package homework_9.task_4;

import java.io.Serializable;

public class Employee implements Serializable {

    public Work work;
    private String name;
    private int age;
    private static final long serialVersionUID = -1067619831764835460L;

    public Employee(String name, int age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.work = new Work();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}