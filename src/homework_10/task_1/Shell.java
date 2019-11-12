package homework_10.task_1;

public class Shell<T> {
    private T item;

    public Shell(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public String getThisItem() {
        return this.item.getClass().getName();
    }
}