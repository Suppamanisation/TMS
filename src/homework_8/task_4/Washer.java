package homework_8.task_4;

public class Washer {
    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isWorking() {
        return isWorking;
    }

    private void drainWater() {
        System.out.println("Вода сливается");
    }

    boolean isWorking;

    public void work() {
        try {
            while (isWorking = true) {
                System.out.println("Стираю");
                if (System.currentTimeMillis() % 5 == 1) {
                    throw new MyCustomException2("Электричество пропало");
                }
                if (System.currentTimeMillis() % 5 == 2) {
                    break;
                }
            }
        } catch (MyCustomException2 e) {
            System.err.println(e.getMessage());
        } finally {
            drainWater();
        }
    }
}

