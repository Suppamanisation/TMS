package homework_14.task_4;

import java.util.Scanner;

// +
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с палиндромами");
        String text = sc.nextLine();
        System.out.println("Палиндромы в тексте:");
        StringUtils.findPalindromes(text);
    }
}
