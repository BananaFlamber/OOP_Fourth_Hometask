package org.example.lesson2.func;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FuncMain {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(ThreadLocalRandom.current().nextInt(100));
        }

        System.out.println(integers);


        integers.stream()
                .filter(it1 -> it1 % 2 == 0)
                .map(it -> it * 2)
                .limit(10)
                .map(it -> new String(it + "_"))
                .forEach(it -> System.out.print(it + " "));
    }

}
