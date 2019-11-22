package homework_13.task_3;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Task 3 (map + filter)
        Есть коллекция телефонов. Необходимо получить из нее коллекцию производителей (производитель - это строка) и оставить только те, которые входят в список:
        Apple, Samsung, Xiaomi*/
public class Task3 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("XS", "Apple", 800));
        phones.add(new Phone("XPERIA", "Sony", 500));
        phones.add(new Phone("Redmi Note 8", "Xiaomi", 400));
        phones.add(new Phone("S10", "Samsung", 1000));
        phones.add(new Phone("ROG Phone", "ASUS", 900));

        System.out.println(phones);

        List<String> prod = phones
                .stream()
                .map(Phone::getProducer)
                            // лучше сделать коллекцию из этих слов и вызывать у этой коллекции contains
                .filter(phone -> phone.contains("Apple") || phone.contains("Samsung") || phone.contains("Xiaomi") || phone.contains("NOKIA"))
                .collect(Collectors.toList());
        System.out.println(prod);

    }
}
