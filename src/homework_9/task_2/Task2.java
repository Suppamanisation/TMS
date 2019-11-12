package homework_9.task_2;

import java.io.*;
import java.util.Scanner;

//Task 2
//        Есть некоторый текст, его нужно записать в файл. Можно использовать одно и тоже предложение, запишите его 10.000 раз
public class Task2 {
    private static final String FILE_PATH = "src/homework_9/task_2/task2";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            // создание файла в отдельный метод
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException();
            }
            // запись в файл лучше тоже в отдельный метод
            try (FileWriter fw = new FileWriter(FILE_PATH)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите текст, который хотите записать 10000 раз");
                String text = sc.next();
                for (int i = 0; i < 10000; i++) { // 10_000 в переменную 
                    fw.append(text);
                    fw.append("\n");
                }
                fw.flush();
            } catch (IOException e) {
                System.err.println("Проблемы с изменением файла");;
            }
// пустая строка не нужна
        } catch (IOException e) {
            System.err.println("Проблемы с созданием файла");
        }
    }
}
