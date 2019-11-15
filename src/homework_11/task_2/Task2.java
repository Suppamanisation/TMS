package homework_11.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*Task 2
        Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка и выведите на экран.
        Затем удалите из него все четные элементы. И снова выведите на экран*/
public class Task2 {
    private static final int SIZE = 100;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(SIZE);
        fillList(list);
        System.out.println(list);
        delete(list);
        System.out.println(list);
    }

    public static void fillList(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(0, rand.nextInt(SIZE));
        }
    }

    public static void delete(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
