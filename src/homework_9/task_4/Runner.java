package homework_9.task_4;

import java.io.*;

//Task 4
//Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
//У Employee есть имя, возраст и работа (work).
//Запишите объект Employee в файл, затем восстановите его обратно в объект.
public class Runner {
    private static final String FILE_PATH = "src/homework_9/task_4/Employees";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.createNewFile() && !file.exists()) {
                throw new IOException();
            }
            Employee empIvan = new Employee("Иван", 50, new Work("Директор",3));
            outputEmployee(empIvan, file);
            inputEmployee(file);
        } catch (IOException e) {
            System.err.println("Ошибка создания файла: " + e.getMessage());
        }
    }

    private static void outputEmployee(Employee employee, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(employee);
            oos.flush();
        } catch (IOException e) {
            System.err.println("Ошибка с записью данных: " + e.getMessage());
        }
    }

    private static void inputEmployee(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);
        } catch (IOException e) {
            System.err.println("Ошибка чтения данных: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Ошибка поиска класс-файла: " + e.getMessage());
        }
    }
}
