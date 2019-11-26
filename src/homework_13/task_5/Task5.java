package homework_13.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Task 5 (limit, reduce)
        Есть коллекция чисел, найти произведение первых 5ти элементов.*/
public class Task5 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> multiInteger = integers
                .stream()
                .limit(5)
                .reduce((x, y) -> x * y);
      // а если в коллекция будет пустой? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(multiInteger.get());
    }
}
