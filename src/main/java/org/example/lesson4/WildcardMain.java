package org.example.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WildcardMain {

    public static void main(String[] args) {
//        wildcardExamples();


//        List<B> foo = foo(new ArrayList<A>(), new ArrayList<C>());

    }

    // T Type
    // E element
    // S P
    public static <T, E extends T, S extends E> List<S> foo(List<T> first, List<E> second) {
        throw new UnsupportedOperationException();
    }

    private static void wildcardExamples() {
        List<A> aList1 = new ArrayList<>();
        List<A> aList2 = new ArrayList<>();

        List<B> bList1 = new ArrayList<>();
        List<B> bList2 = new ArrayList<>();

        List<C> cList1 = new ArrayList<>();
        List<C> cList2 = new ArrayList<>();

        List<D> dList1 = new ArrayList<>();
        List<D> dList2 = new ArrayList<>();

        List<E> eList1 = new ArrayList<>();
        List<E> eList2 = new ArrayList<>();

//        cList.add(new A());
//        cList.add(new B());
        cList1.add(new C());
        cList2.add(new D());
        cList1.add(new E());

        Comparator<C> cComparator = null;
        Collections.sort(cList1, cComparator);

        Comparator<B> bComparator = null;
        Collections.sort(cList1, bComparator);

        Comparator<D> dComparator = null;
//        Collections.sort(cList, dComparator);

        // Object <- A <- B <- C <- D <- E
        copy(aList1, aList2);
//        copy(bList1, dList2); // нельзя blist[b, c, d, e] -> dlist[d, e]
        copy(dList1, bList2); // можно  dlist[d, e] -> blist[b, c, d, e]
    }

    // PECS Producer Extends Consumer Super (Поставщик и Потребитель)
    // ? - wildcard
    public static <T> void copy(List<? extends T> source, List<? super T> target) {
        // Перекачать все элементы из source в target
    }

    public static class A {

    }

    public static class B extends A {

    }

    public static class C extends B {

    }

    public static class D extends C {

    }

    public static class E extends D {

    }

}
