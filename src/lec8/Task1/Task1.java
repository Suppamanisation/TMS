package lec8.Task1;

import java.util.Scanner;

//Task 1
//        Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
//        И вывести пользователю сообщение о том, что на 0 делить нельзя
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double number = sc.nextInt();
        System.out.println("Введите второе число");
        double number2 = sc.nextInt();
        try {
            double number3 = number / number2;
            System.out.println(number3);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
    }
}
