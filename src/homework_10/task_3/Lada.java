package homework_10.task_3;

import java.awt.*;

// +
public class Lada extends Car {
    public Lada(long vin, short year, Color color) {
        super(vin, year, color);
    }

    @Override
    public String toString() {
        return "Lada{" +
                "vin=" + vin +
                ", year=" + year +
                ", color=" + color +
                '}';
    }
}
