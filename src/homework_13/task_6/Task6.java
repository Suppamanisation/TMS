package homework_13.task_6;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;

/*Task 6 (distinct)
        Есть коллекция телефонов, нужно убрать все повторяющиеся*/

// +
public class Task6 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("XS", "Apple", 800));
        phones.add(new Phone("XPERIA", "Sony", 500));
        phones.add(new Phone("Redmi Note 8", "Xiaomi", 400));
        phones.add(new Phone("Redmi Note 8", "Xiaomi", 400));
        phones.add(new Phone("Redmi Note 8", "Xiaomi", 400));
        phones.add(new Phone("S10", "Samsung", 1000));
        phones.add(new Phone("ROG Phone", "ASUS", 900));

        phones.stream().distinct().forEach(System.out::println);
    }
}
