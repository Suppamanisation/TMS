package homework_10.task_3;

import java.awt.*;

public abstract class Car {
    protected long vin; // protected
    protected short year; // protected
    protected Color color; // protected

    public Car(long vin, short year, Color color) {
        this.vin = vin;
        this.year = year;
        this.color = color;
    }
}
