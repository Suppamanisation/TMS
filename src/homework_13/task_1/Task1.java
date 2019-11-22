package homework_13.task_1;

/*
Task 1. (filter)
        Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Come");
        strings.add("with");
        strings.add("me");
        strings.add("to");
        strings.add("the");
        strings.add("dark");
        strings.add("side");
        strings.add("Anakin");
        System.out.println(strings);

        List<String> stringsStream = strings.stream()
                .filter(string -> string.length() > 5)
                .collect(Collectors.toList());
        System.out.println(stringsStream);
    }
}
