package homework_16.task_3;

/*Task 3
Есть магазин игрушек, в который несколько поставщиков (потоков) доставляют товар. Вам необходимо доставить в магазин игрушки
(например 100 от одного поставщика и 50 от другого и затем вывести на экран все игрушки, которые сейчас в магазине*/

public class Store {
    private int toys;
    private Object syncObject = new Object();

    public synchronized void incrementSync1() {
        synchronized (syncObject) {
            toys++;
        }
    }

    public void incrementSync2() {
        synchronized (syncObject) {
            toys++;
        }
    }

    public int getToys() {
        return toys;
    }

    static class ValueIncrement implements Runnable {
        private Store store;

        public ValueIncrement(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50_000; i++) {
                store.incrementSync1();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();

        ValueIncrement valueIncrement = new ValueIncrement(store);

        Runnable runnable_2 = () -> {
            for (int i = 0; i < 100_000; i++) {
                store.incrementSync2();
            }
        };

        Thread thread_1 = new Thread(valueIncrement);
        Thread thread_2 = new Thread(runnable_2);

        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();

        System.out.println(store.getToys());
    }
}
