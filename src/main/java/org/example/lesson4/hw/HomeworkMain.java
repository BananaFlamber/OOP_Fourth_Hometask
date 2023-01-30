package org.example.lesson4.hw;

public class HomeworkMain {

    public static void main(String[] args) {
        Box<String> stringBox = new Box(); // запрещено!

        Box<Apple> apples = new Box();
        apples.add(new Apple(1.0));
        apples.add(new Apple(2.0));
        apples.add(new Apple(3.0));
        apples.add(new Orange(3.0)); // запрещено!!!
        apples.add(new GoldenApple(3.0)); // разрешено
        System.out.println(apples.getBoxWeight()); // 9.0

        Box<Orange> orangeBox = new Box();
        orangeBox.add(new Orange(1.0));
        orangeBox.add(new Apple(1.0)); // запрещено!!!
        System.out.println(orangeBox.getBoxWeight()); // 1.0

        Box<GoldenApple> goldenAppleBox = new Box();
        goldenAppleBox.add(new GoldenApple(2.0));
        goldenAppleBox.add(new Apple(2.0)); // запрещено!
        System.out.println(goldenAppleBox.getBoxWeight()); // 2.0


        goldenAppleBox.moveTo(apples); // можно
        System.out.println(goldenAppleBox.getBoxWeight()); // 0.0
        System.out.println(apples); // 9.0 + 2.0 = 11.0

        apples.moveTo(goldenAppleBox); // нельзя!
        orangeBox.moveTo(apples); // нельзя
    }

}
