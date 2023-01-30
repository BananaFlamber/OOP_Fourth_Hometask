package org.example.lesson3;

public class Notebook {

    private final int ram;
    private final double price;

    public Notebook(int ram, double price) {
        this.ram = ram;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }
}
