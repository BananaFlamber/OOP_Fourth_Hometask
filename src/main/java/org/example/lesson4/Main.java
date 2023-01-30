package org.example.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        genericIntro();
//        genericExtendsDemo();

        List<StringWrapper> first = new ArrayList<>(List.of(
                new StringWrapper("third"),
                new StringWrapper("second"),
                new StringWrapper("first")
        ));

//        Collections.sort(first);
        Comparator<StringWrapper> stringWrapperComparator = null; //Comparator.comparing(StringWrapper::getValue);
//        Collections.sort(first);
        System.out.println(first);
    }

    private static void genericIntro() {
        List<String> strings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
//        strings.add(4);

        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
//            String str = (String) obj;
            System.out.println(str.length());
        }
    }

    private static void genericExtendsDemo() {
        NumberStorage<Long> numberStorage = new NumberStorage<>();
        numberStorage.add(5L);
        numberStorage.add(5L);
        numberStorage.add(5L);
//        numberStorage.add(5);
//        numberStorage.add(5.3);

        Long longValue = numberStorage.get(2);
        System.out.println(longValue);
    }

    public static class NumberStorage<E extends Number> {

        private List<E> numbers = new ArrayList<>();

        public void add(E number) {
            numbers.add(number);
        }

        public E get(int i) {
            return numbers.get(i);
        }

    }

    public static class StringWrapper {

        private String value;

        public StringWrapper(String value) {
            this.value = value;
        }

//        @Override
//        public int compareTo(Object o) {
//            throw new UnsupportedOperationException();
////            return value.compareTo(o.getValue());
//        }

        public String getValue() {
            return value;
        }
    }

}
