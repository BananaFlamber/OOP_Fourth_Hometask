package org.example.lesson2.adapter;

public class KmHoursCar implements Car {

    private final double speed;

    public KmHoursCar(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
