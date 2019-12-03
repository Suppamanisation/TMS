package homework_14.task_2;

/*Task 2
Есть текстовый файл. Нужно скопировать из него только те строки, которые содержат слово pancakes и записать их в другой файл*/

import java.io.*;

public class Task2 {
    private static final String FILE_PATH_1 = "src/homework_14/task_2/Text1";
    private static final String FILE_PATH_2 = "src/homework_14/task_2/Text2";

    public static void main(String[] args) {
        createFile(FILE_PATH_1);
        pancakes(FILE_PATH_1, FILE_PATH_2);
    }

    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.createNewFile() && !file.exists()) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("Ошибка создания файла" + e.getMessage());
        }
    }

    public static void pancakes(String filePath1, String filePath2) {
        try (FileReader fr = new FileReader(filePath1);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(filePath2, true)) {
            String strRead;
            while ((strRead = br.readLine()) != null) {
                if (strRead.toLowerCase().contains("pancakes")) { // константа
                    fw.write(strRead + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла" + e.getMessage());
        }
    }
}
