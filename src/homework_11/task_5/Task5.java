package homework_11.task_5;

import java.util.*;

// +
public class Task5 {
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
            list.remove(list.size() / 2);
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
