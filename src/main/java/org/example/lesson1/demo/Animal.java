package org.example.lesson1.demo;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    public void eat(Plate plate) {
//
//    }

    public abstract void voice();

    @Override
    public String toString() {
        return name;
    }
}
