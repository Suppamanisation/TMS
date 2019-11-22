package homework_13.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*Task 4 (filter + findFirst)
        Есть коллекция чисел, найти первое, которое будет больше 22.*/
public class Task4 {
    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        integer.add(12);
        integer.add(123);
        integer.add(152);
        integer.add(22);
        integer.add(23);
        integer.add(164);
        integer.add(25);
        integer.add(65);
        System.out.println(integer);

        Optional<Integer> filteredInt = integer
                .stream()
                .filter(integer1 -> integer1 > 22)
                .findFirst();
         // а если в коллекции не будет числа > 22? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(filteredInt.get());
    }
}
