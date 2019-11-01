package lec8.Task4;

public class Washer {
    public boolean getIsWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    boolean isWorking;

    public void work() {
        try {
            while (isWorking) {
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

    private void drainWater() {
        System.out.println("Вода сливается");
    }
}

