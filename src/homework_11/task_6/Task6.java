package homework_11.task_6;

import java.util.*;

/*Task 6
        Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
        Удалить нужно все элементы*/
//+
public class Task6 {
    private static final int SIZE = 100000;

    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList<>();
        fillList(intArrayList);
        List<Integer> intLinkedList = new LinkedList<>(intArrayList);
        System.out.println("ArrayList finished for: ");
        System.out.println(deleteElem(intArrayList) + " ms");
        System.out.println("LinkedList finished for: ");
        System.out.println(deleteElem(intLinkedList) + " ms");
    }

    public static long deleteElem(List<Integer> list) {
        Date start = new Date();
        for (int i = 0; i < SIZE; i++) {
            list.remove(0);
        }
        Date finish = new Date();
        return finish.getTime() - start.getTime();
    }

    public static void fillList(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(0, rand.nextInt(SIZE));
        }
    }
}
