package homework_9.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Task 3
//Прочитать файл из Task_2 и вывести на экран содержимое
public class Task3 {
    private static final String FILE_PATH = "src/homework_9/task_2/task2";

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(FILE_PATH);
        BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Проблема с чтением файла");
        }
    }
}

