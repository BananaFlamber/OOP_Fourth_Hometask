package org.example.lesson2.game;

public class Road implements Obstacle {

    private final int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant runnable) {
        int distanceLimit = runnable.getDistanceLimit();
        return distanceLimit >= distance;
    }

    @Override
    public String type() {
        return "дорога";
    }

    public int getDistance() {
        return distance;
    }
}
