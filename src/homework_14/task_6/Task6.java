package homework_14.task_6;

import java.util.Arrays;
import java.util.stream.IntStream;

/*Есть два отсортированных массива, необходимо самым оптимальным способом сделать из них один и тоже отсортированный
        [1,4,5]
        [0,2,3]
Результат: [0,1,2,3,4,5]*/

public class Task6 {
        public static void main(String[] args) {
            int[] arr1 = {3, 5, 6, 8, 9};
            int[] arr2 = {0, 1, 2, 4, 7};
            int[] res = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
            System.out.println(Arrays.toString(res));
        }
}
