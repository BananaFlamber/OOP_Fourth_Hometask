package org.example.lesson1.question;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.age = -5;
//        employee.setAge(-5);
        employee.getList().add("sdf");

        System.out.println(employee.getList());
    }

}
