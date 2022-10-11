package ru.alibaff.car.factory.kpp.impl;

import ru.alibaff.car.factory.kpp.KPP;

public class RKPP extends KPP {

    @Override
    public void changeGear() {
        // do nothing
    }

    @Override
    public void selectGear(int gear) {
        this.gear = gear;
    }

    public String getName() {
        return "Ручная КПП";
    }
}
