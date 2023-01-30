package org.example.lesson2.adapter;

public class CarService {

    public double calculateDistance(Car car, int timeHours) {
        return car.getSpeed() * timeHours;
    }

}
