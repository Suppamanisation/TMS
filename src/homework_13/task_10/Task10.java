package homework_13.task_10;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// +
public class Task10 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("XS", "Apple", 800));
        phones.add(new Phone("Redmi Note 8", "Xiaomi", 400));
        phones.add(new Phone("XR", "Apple", 600));
        phones.add(new Phone("ZenFone", "ASUS", 250));
        phones.add(new Phone("XPERIA", "Sony", 500));
        phones.add(new Phone("Note 10", "Samsung", 1200));
        phones.add(new Phone("XPERIA", "Sony", 500));
        phones.add(new Phone("Mi Play", "Xiaomi", 170));
        phones.add(new Phone("S10", "Samsung", 1000));
        phones.add(new Phone("ROG Phone", "ASUS", 900));

        Map<String, Long> group = phones
                .stream()
                .collect(Collectors.groupingBy(Phone::getProducer, Collectors.counting()));

        for (Map.Entry<String, Long> entry : group.entrySet()) {
            System.out.println(entry);
        }
    }
}
