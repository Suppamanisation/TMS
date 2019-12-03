package homework_14.task_5;

/*Task 5
Создать лист элементов (типа Cat). Заполнить лист элементами и null,
сериализовать лист в файл и десериализовать из файла. проверить наличие null элементов*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// +
public class Task5 {
    private static final String PATH = "src/homework_14/task_5/cat";

    public static void main(String[] args) {
        List<Cat> cats = addCat();
        listOutput(PATH, cats);
        listInput(PATH);
        checkNull(cats);
    }

    private static List<Cat> addCat() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Артём"));
        cats.add(new Cat("Тимур"));
        cats.add(new Cat("Чепуха"));
        cats.add(null);
        return cats;
    }

    private static void listOutput(String fileName, List<Cat> cats) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(cats);
            System.out.println("Файл успешно записан");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла");
        }
    }

    private static void listInput(String fileName) {
        ArrayList<Cat> newCats;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            newCats = (ArrayList<Cat>) ois.readObject();
            for (Cat newCat : newCats) {
                System.out.println(newCat);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка чтения файла");
        }
    }

    private static void checkNull(List<Cat> cats) {
        int count = 0;
        for (Cat cat : cats) {
            if (cat == null) {
                count++;
            }
        }
        System.out.println("В листе " + count + " объектов null");
    }
}
