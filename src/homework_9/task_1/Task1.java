package homework_9.task_1;
//Task 1
//        Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл

import java.io.*;
import java.util.Random;

public class Task1 {
    private static final String FILE_PATH = "src/homework_9/task_1/task1";

    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[5];
        // заполнение массива в отдельный метод
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(9);
            System.out.print(arr[i] + " ");
        }

        // запись в файл в отдельный метод
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH)) {
            for (int i = 0; i < arr.length; i++) {
                fos.write(arr[i]);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n***********************");
        
        // чтение из файла в отдельный метод
        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
