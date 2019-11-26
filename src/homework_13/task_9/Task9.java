package homework_13.task_9;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Task 9
Есть коллекция телефонов. Нужно разделить на две части, в одной только айфоны, в другой остальные производители.*/
public class Task9 {
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
        System.out.println(phones);

  // твой вариант не оптимальный, дважды нужно итерироваться по коллекции. На лекции я показывал вариант с partitioning, посмотри его
        List<Phone> appleGroup = phones
                .stream()
                .filter(phone -> phone.getProducer().contains("Apple"))
                .collect(Collectors.toList());
        System.out.println(appleGroup);

        List<Phone> elseGroup = phones
                .stream()
                .filter(phone -> !phone.getProducer().contains("Apple"))
                .collect(Collectors.toList());
        System.out.println(elseGroup);
////////////////////////////////////////////////////////////////////////////////////////////
        // а зачем это повторение?
        Stream<Phone> appleGroup1 = phones
                .stream()
                .filter(phone -> phone.getProducer().contains("Apple"));

        Stream<Phone> elseGroup1 = phones
                .stream()
                .filter(phone -> !phone.getProducer().contains("Apple"));

        List<Phone> concat = Stream.concat(elseGroup1, appleGroup1)
                .collect(Collectors.toList());
        System.out.println(concat);
    }
}
