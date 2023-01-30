package org.example.lesson2.adapter;

public class CarServiceMain {

    public static void main(String[] args) {
        Car car = new KmHoursCar(100.0);

        CarService carService = new CarService();
        System.out.println(carService.calculateDistance(car, 1));

        MetersMinutesCar car2 = new MetersMinutesCar(80);
        MeterMinutesCarAdapter carMeterMinutesAdapter = new MeterMinutesCarAdapter(car2);
        System.out.println(carService.calculateDistance(carMeterMinutesAdapter, 1));
    }

}
