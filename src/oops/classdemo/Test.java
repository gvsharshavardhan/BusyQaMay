package oops.classdemo;

import oops.school.Student;

public class Test {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.drive();
        String col = bmw.color;
        System.out.println(col);

        Car ford = new Car();
        ford.color = "white";
        ford.drive();

        Student s1 = new Student();

    }
}
