package homework_10.task_3;
//Task 3
//        Есть 3 типа гаражей:
//        1. Могут храниться только BMW
//        2. Могут храниться только Lada
//        3. Могут храниться все авто
//        Придумайте такой класс и создайте 3 типа гаражей, используйте generics

import java.awt.*;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new Lada(356457568789L, (short) 2011, Color.GRAY),
                new Lada(346457678868L, (short) 2010, Color.GREEN),
                new BMW(12334554667L, (short) 2007, Color.BLACK)};

        Garage<Car> garage = new Garage<>("Красная 8, гараж для любых машин");
        // зачем в конструктор передавать пустой ArrayList и затем заполнять его, сразу передавай заполненный
        // BMWGarage -> bmwGarage
        Garage<BMW> BMWGarage = new Garage<>("Красная 9, гараж для BMW", new ArrayList<>());
        // LadaGarage -> ladaGarage
        Garage<Lada> LadaGarage = new Garage<>("Красная 10, гараж для Lada", new ArrayList<>());

        for (Car car : cars) {
            garage.getCars().add(car);
            if (car instanceof BMW) {
                BMWGarage.getCars().add((BMW) car);
            }
            if (car instanceof Lada) {
                LadaGarage.getCars().add((Lada) car);
            }
        }

        System.out.println(garage);
        System.out.println(BMWGarage);
        System.out.println(LadaGarage);
    }
}
