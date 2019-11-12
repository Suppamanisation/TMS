package homework_9.task_5;
//Task 5
//Продолжение Task_4. А теперь поменяйте любое приватное поле Work/Employee на паблик.
//Создайте новый класс для метода мейн и попробуйте прочитать файл, который вы туда записали.
//Попробуйте найти решение в интернете

import homework_9.task_4.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Task5 {

    private static final String FILE_PATH = "src/homework_9/task_4/Employees";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            // зачем кусок кода с созданием файла? тебе же прочитать из него надо
            if (!file.createNewFile() && !file.exists()) {
                throw new IOException();
            }
            inputEmployee(file);
        } catch (IOException e) {
            System.err.println("Ошибка создания файла: " + e.getMessage());
        }
    }

    // void -> Employee
    private static void inputEmployee(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
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
}
