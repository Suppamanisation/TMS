package homework_9.task_4;

import java.io.Serializable;

public class Work implements Serializable {
    private String name;
    private int exp;

    public Work(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }

    public Work(String name) {
        this.name = name;
        exp = 0;
    }

    public Work() {
        this.name = "None";
        exp = 0;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name ='" + name + '\'' +
                ", exp = " + exp + " года" +
                '}';
    }
}