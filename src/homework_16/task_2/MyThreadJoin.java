package homework_16.task_2;

/*Task 2
Создать класс, который в цикле выводит на экран числа от 0-20 и в каждой итерации цикла засыпает на 1 секунду,
запустить его экземпляр и запустить в отдельном потоке. Поток main должен дождаться окончания работы дочернего потока
и затем вывести на экран сообщение о том, что главный поток завершен*/


public class MyThreadJoin extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThreadJoin myThread = new MyThreadJoin();
        myThread.start();

        myThread.join();

        System.out.println("isAlive:" + myThread.isAlive());
        System.out.println("Main finished");
    }
}
