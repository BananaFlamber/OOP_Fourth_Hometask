package org.example.lesson2.game;

public abstract class Participant implements Runnable, Jumpable, Swimmable {

    private final String name;
    private final int distanceLimit;
    private final int swimLimit;
    private final int jumpLimit;

    public Participant(String name, int distanceLimit, int swimLimit, int jumpLimit) {
        this.name = name;
        this.distanceLimit = distanceLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getDistanceLimit() {
        return distanceLimit;
    }

    @Override
    public int getSwimLimit() {
        return swimLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }
}
