package ru.alibaff.car.factory.car;

public class Car<A, B> {
    private A kpp;
    private B rezina;
    private int carSpeed;
    private int engineSpeed;
    private int angle;

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public A getKpp() {
        return kpp;
    }

    public void setKpp(A kpp) {
        this.kpp = kpp;
    }

    public B getRezina() {
        return rezina;
    }

    public void setRezina(B rezina) {
        this.rezina = rezina;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }
}
