package homework_10.task_2;
//Task 2
//        Есть папка с файлами, которые нужно переименовать.
//        Реализуйте паттерн "стратегия" при помощи Enum для переименования файлов:
//        - имя файла маленькими буквами
//        - первая бука в имени файла с большой буквы, а остальные маленькие
//        - имя файла написано кэпс локом (все буквы большие)
//        Напишите класс, у которого будет метод принимающий текущее имя файла и стратегию для переименования.

import java.io.File;
import java.util.Scanner;

public class Runner {
    private static final String DIRECTORY_PATH = "src/homework_10/task_2/folder";

    public static void main(String[] args) {
        File directory = new File(DIRECTORY_PATH);
        File[] files = directory.listFiles();
        Scanner scanner;
        boolean isCorrect;
        for (File file : files != null ? files : new File[0]) {
            System.out.println("Выберите вариант действий с файлом " + file.getName());
            enumMenu();
            scanner = new Scanner(System.in);
            isCorrect = false;
            while (!isCorrect) {
                try {
                    RenameStrategy enumRename = RenameStrategy.valueOf(scanner.next());
                    isCorrect = true;
                    if (enumRename.renameFile(file)) {
                        System.out.println("Имя файла изменено");
                    } else {
                        System.out.println("Имя файла не изменено");
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println("Выберите один из вариантов");
                    scanner = new Scanner(System.in);
                }
            }
        }
    }

    private static void enumMenu() {
        RenameStrategy[] values = RenameStrategy.values();
        for (RenameStrategy value : values) {
            System.out.println(value.toString());
        }
    }
}