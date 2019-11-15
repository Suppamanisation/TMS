package homework_11.task_7;
/*Task 7
        Есть TreeSet чисел, нужно отсортировать его в обратном порядке*/

import java.util.*;

public class Task7 {
    private static final int SIZE = 100;

    public static void main(String[] args) {
        Set<Integer> intTreeSet = new TreeSet<>();
        fillSet(intTreeSet);
        System.out.println("Sorted order");
        System.out.println(intTreeSet);
        Set<Integer> revIntTreeSet = new TreeSet<>(Collections.reverseOrder());
        revIntTreeSet.addAll(intTreeSet);
        System.out.println("Reversed order");
        System.out.println(revIntTreeSet);
    }

    public static void fillSet(Set<Integer> set) {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            set.add(rand.nextInt(SIZE));
        }
    }
}
