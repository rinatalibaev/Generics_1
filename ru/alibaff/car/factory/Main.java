package ru.alibaff.car.factory;

import ru.alibaff.car.factory.assembler.CarAssembler;
import ru.alibaff.car.factory.car.Car;
import ru.alibaff.car.factory.kpp.KPP;
import ru.alibaff.car.factory.kpp.impl.AKPP;
import ru.alibaff.car.factory.kpp.impl.RKPP;
import ru.alibaff.car.factory.rezina.Seazon;
import ru.alibaff.car.factory.rezina.impl.Summer;
import ru.alibaff.car.factory.rezina.impl.Winter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarAssembler<AKPP, Summer> carAssembler1 = new CarAssembler<>(AKPP.class, Summer.class);
        Car<AKPP, Summer> car1 = carAssembler1.assembleCar();
        car1.setCarSpeed(50);
        car1.setEngineSpeed(1500);
        car1.setAngle(5);
        car1.getKpp().changeGear();

        CarAssembler<RKPP, Winter> carAssembler2 = new CarAssembler<>(RKPP.class, Winter.class);
        Car<RKPP, Winter> car2 = carAssembler2.assembleCar();
        car2.setCarSpeed(40);
        car2.setEngineSpeed(1200);
        car2.setAngle(10);
        car2.getKpp().selectGear(5);

        for (Car<? extends KPP, ? extends Seazon> car : List.of(car1, car2)) {
            System.out.println("***car***");
            System.out.println("kpp type: " + car.getKpp().getName());
            System.out.println("speed: " + car.getCarSpeed());
            System.out.println("engine speed: " + car.getEngineSpeed());
            System.out.println("angle: " + car.getAngle());
            System.out.println("rezina: " + car.getRezina().getName());
            System.out.println();
        }

    }
}
