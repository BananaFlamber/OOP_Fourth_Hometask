package org.example.lesson2.adapter;

public class MeterMinutesCarAdapter implements Car {

    private final MetersMinutesCar metersMinutesCar;

    public MeterMinutesCarAdapter(MetersMinutesCar metersMinutesCar) {
        this.metersMinutesCar = metersMinutesCar;
    }

    @Override
    public double getSpeed() {
        double speedMetersMinutes = metersMinutesCar.getSpeed();
        return speedMetersMinutes * 60 / 1000.0;
    }
}
