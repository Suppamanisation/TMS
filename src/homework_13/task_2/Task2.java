package homework_13.task_2;

import java.util.*;

/*Task 2 (max, String::compareTo / Comparator.naturalOrder())
        Есть коллекция строк, нужно найти строку с максимальной длинной.*/
public class Task2 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Cheburek");
        strings.add("Kek");
        strings.add("Mark");
        StringComparator stringComparator = new StringComparator();

        Optional<String> maxString = strings
                .stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(maxString.get());

        Optional<String> maxStringComparator = strings
                .stream()
                .max(stringComparator);
        System.out.println(maxStringComparator.get());
    }
}
