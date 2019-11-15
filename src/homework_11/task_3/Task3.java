package homework_11.task_3;

/*Task 3
        Есть две коллекции, нужно удалить из первой те, которые есть во второй*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    private static final int SIZE = 20;

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(SIZE);
        List<Integer> list2 = new ArrayList<>(SIZE);
        fillList(list1);
        System.out.println(list1);
        fillList(list2);
        System.out.println(list2);
        list1.removeAll(list2);
        System.out.println(list1);
    }

    public static void fillList(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(0, rand.nextInt(SIZE));
        }
    }
}
