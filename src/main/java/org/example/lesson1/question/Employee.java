package org.example.lesson1.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

    private int age;
    private List<String> list = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public List<String> getList() {
        return Collections.unmodifiableList(list);
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
}
