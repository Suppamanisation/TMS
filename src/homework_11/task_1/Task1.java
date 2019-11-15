package homework_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Task 1
        Вход на вечеринку только по списку.
        Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
        после чего говорит может он пройти или нет*/
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);
        list.add("Никита");
        list.add("Вася");
        list.add("Петя");
        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        if (list.contains(sc.next())) {
            System.out.println("You're in");
        } else {
            System.out.println("Get out");
        }
    }
}
