package org.example.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparableDemo {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "ajsfhakfd", "fa", "bhhf", "add", "ppoqfhdkfajdsfi;ahdff"
        ));


        // если s1 длиннее s2, то это означает, что s1 меньше, чем о2, то возвращаем любое отрицательное число
        Comparator<String> stringLengthComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());
//        Comparator<String> stringLengthComparator = Comparator.comparing(String::length).reversed();

        int compare = stringLengthComparator.compare("abc", "def");
        int compareTo = "abc".compareTo("def");

        Collections.sort(words, stringLengthComparator);
        System.out.println(words);
    }

    private <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            //...
            int compare = array[i].compareTo(array[i + 1]);
//            int compare = comparator.compare(array[i], array[i + 1]);
            if (compare < 0) {
//            if (array[i] < array[i + 1]) {
                // ...
            }
        }
    }

}
