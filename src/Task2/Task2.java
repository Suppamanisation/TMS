package Task2;

import java.util.Scanner;

//Task 2
//        Написать метод, который бы парсил строку в число, обработать исключение, которое может быть при неверном формате числа
public class Task2 {
        public static void main(String[] args) {
            String str = null;
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите любое число");
                str = scanner.next();
                Integer number = Integer.parseInt(str);
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа. " + str + " - это не число!");
            }
        }
}
