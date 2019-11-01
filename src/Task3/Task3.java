package Task3;
//Task 3
//        Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//        Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//        попросите пользователя ввести число заново.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws MyCustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива не более 15 и не менее 0");
        int index = sc.nextInt();
        try {
            if (index <= 15 && index >= 0) {
                int[] arr = new int[index];
            } else {
                throw new MyCustomException("Неверный размер массива");
            }
        } finally {
        }
    }
}
