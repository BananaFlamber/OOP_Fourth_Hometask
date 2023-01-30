package org.example.lesson3;

import java.util.Iterator;

public class Homework {

    public static void main(String[] args) {
        // 1. Создать список объектов типа Notebook
        // Отсортировать его тремя способами:
        // 1.1 по ОЗУ (ram)
        // 1.2 по цене (price)sdfsdf
        // 1.3 сначала по ram, потом по price (если ram не равны, сортируем по ним; если равны, то по цене)

        // 2. Реализовать итератор для массива
        int[] source = {1, 2, 3, 4, 5, 6, 7};
        Iterator<Integer> intArrayIterator = new IntArrayIterator(source);
        while (intArrayIterator.hasNext()) {
            // FIXME: 20.01.2023 Должно работать!
            System.out.println(intArrayIterator.next());
        }
    }

    private static class Notebook {

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

    private static class IntArrayIterator implements Iterator<Integer> {

        private final int[] source;

        public IntArrayIterator(int[] source) {
            this.source = source;
        }

        @Override
        public boolean hasNext() {
            // FIXME: 20.01.2023 Код писать тут
            return false;
        }

        @Override
        public Integer next() {
            // FIXME: 20.01.2023 Код писать тут
            return null;
        }
    }

}
