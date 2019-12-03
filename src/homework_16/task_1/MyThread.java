package homework_16.task_1;

/*Task 1
Создать класс, который в цикле выводит на экран числа от 0-10, запустить его в отдельном потоке*/

public class MyThread extends Thread {

    @Override
    public void run() {
        // 10 лучше через конструктор
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
