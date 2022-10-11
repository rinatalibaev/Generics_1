package ru.alibaff.car.factory.kpp;

import ru.alibaff.car.factory.car.Car;

public abstract class KPP {
    protected int gear;
    protected Car<?, ?> car; // для КПП неважно, какая резина стоит на авто

    protected abstract void changeGear();

    protected abstract void selectGear(int gear);

    public abstract String getName();

    public void setCar(Car<?, ?> car) {
        this.car = car;
    }
}
