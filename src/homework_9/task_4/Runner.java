package homework_9.task_4;

import java.io.*;

//Task 4
//Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
//У Employee есть имя, возраст и работа (work).
//Запишите объект Employee в файл, затем восстановите его обратно в объект.
public class Runner {
    private static final String FILE_PATH = "src/homework_9/task_4/Employees";

    public static void main(String[] args) {
            // создание файла в отдельный метод
            createFile(FILE_PATH);
            Employee empIvan = new Employee("Иван", 50, new Work("Директор",3));
            outputEmployee(empIvan, FILE_PATH);
            inputEmployee(FILE_PATH);
    }

    private static void outputEmployee(Employee employee, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employee);
            oos.flush();
        } catch (IOException e) {
            System.err.println("Ошибка с записью данных: " + e.getMessage());
        }
    }

    // void -> Employee
    private static void inputEmployee(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Employee employee = (Employee) ois.readObject();
            // return employee;
            // а на экран в методе мейн
            System.out.println(employee);
        } catch (IOException e) {
            System.err.println("Ошибка чтения данных: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Ошибка поиска класс-файла: " + e.getMessage());
        }
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
}
