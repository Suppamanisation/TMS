package homework_11.task_10;

public class Fruits {
    private String name;
    private Double weight;

    public Fruits(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return '\n' + "Fruits{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
