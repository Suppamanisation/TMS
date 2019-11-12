package homework_10.task_3;

import java.awt.*;

public class BMW extends Car {
    public BMW(long vin, short year, Color color) {
        super(vin, year, color);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "vin=" + vin +
                ", year=" + year +
                ", color=" + color +
                '}';
    }
}