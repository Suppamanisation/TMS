package homework_11.task_8;

public class Shop {
    private String name;
    private int ID; // id

    public Shop(String name, int id) {
        this.name = name;
        ID = id;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}

