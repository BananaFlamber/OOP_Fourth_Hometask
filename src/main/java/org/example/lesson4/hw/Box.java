package org.example.lesson4.hw;

import java.util.List;

public class Box<Fruit> {

    // Реализовать хранение фруктов в коробке.
    // Должны быть доступны следующие возможности
    // Добавление фрукта
    // Должен быть конструктор
    // Метод, который пересыпает фрукты из текущей коробки в другую коробку
    // Для внутреннего хранения можно использовать например List


    private List<Fruit> fruitList;

    public void add(Fruit fruit) {
        fruitList.add(fruit);
    }
    
    public double getBoxWeight() {
        double result = 0;
        for (Fruit fruit: fruitList) {
            result += fruit.getWeight();
        }
        return result;
    }

    public void moveTo(Box<? super Fruit> box) {
        // TODO: 24.01.2023
        // Пересыпать фрукты из текущей коробки в anotherBox
    }

}
