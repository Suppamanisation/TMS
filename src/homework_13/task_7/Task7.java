package homework_13.task_7;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*Task 7
Есть коллекция телефонов. Найти телефон с наименьшей ценой*/
public class Task7 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("XS", "Apple", 800));
        phones.add(new Phone("XPERIA", "Sony", 500));
        phones.add(new Phone("Redmi Note 8", "Xiaomi", 400));
        phones.add(new Phone("S10", "Samsung", 1000));
        phones.add(new Phone("ROG Phone", "ASUS", 900));
        System.out.println(phones);

        Optional<Phone> minCost = phones
                .stream()
                .min(Comparator.comparing(Phone::getPrice));
        System.out.println(minCost.get());
    }
}
