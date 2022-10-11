package ru.alibaff.car.factory.assembler;

import ru.alibaff.car.factory.car.Car;
import ru.alibaff.car.factory.kpp.KPP;

import java.lang.reflect.InvocationTargetException;

public class CarAssembler<A, B> {
    Class<A> kppType;
    Class<B> rezinaType;

    public CarAssembler(Class<A> kppType, Class<B> rezinaType) {
        this.kppType = kppType;
        this.rezinaType = rezinaType;
    }

    public Car<A, B> assembleCar() {
        Car<A, B> car = new Car<>();
        try {
            setKpp(car);
        } catch (Exception e) {
            System.out.println("Do nothing");
        }
        try {
            setRezina(car);
        } catch (Exception e) {
            System.out.println("Do nothing");
        }
        return car;
    }

    private void setKpp(Car<A, B> car) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        A kpp = kppType.getDeclaredConstructor().newInstance();
        car.setKpp(kpp);
        ((KPP) kpp).setCar(car);
    }

    private void setRezina(Car<A,B> car) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        car.setRezina(rezinaType.getDeclaredConstructor().newInstance());
    }

}
