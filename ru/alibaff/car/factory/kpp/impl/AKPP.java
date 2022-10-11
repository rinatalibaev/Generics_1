package ru.alibaff.car.factory.kpp.impl;

import ru.alibaff.car.factory.kpp.KPP;

public class AKPP extends KPP {

    @Override
    public void changeGear() {
        this.gear = car.getCarSpeed() * car.getEngineSpeed() * car.getAngle() / 100000; // формулу абсолютно с потолка взял
    }

    @Override
    public void selectGear(int gear) {
        // do nothing
    }

    public String getName() {
        return "Автоматическая КПП";
    }
}
