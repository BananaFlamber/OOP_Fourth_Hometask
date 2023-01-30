package org.example.lesson1.demo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Bark!");
    }
}
