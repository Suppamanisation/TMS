package homework_14.task_3;

/*Task 3
Есть две HashMap<String, List<Integer>>, нужно сделать из них одну (смержить)*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> hashMap1 = new HashMap<>();
        hashMap1.put("array1", new ArrayList<>(Arrays.asList(1, 4, 5, 9)));
        HashMap<String, List<Integer>> hashMap2 = new HashMap<>();
        hashMap2.put("array2", new ArrayList<>(Arrays.asList(2, 3, 6, 7, 8)));
        hashMap2.forEach((key, value) -> hashMap1.merge(key, value, (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        }));
        System.out.println(hashMap1);
    }
}
