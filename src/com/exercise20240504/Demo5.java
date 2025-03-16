package com.exercise20240504;

public class Demo5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area(2);
        circle.circumference(3);
    }
}

class Circle {
    public void circumference(double radius) {
        System.out.println(2 * Math.PI * radius);
    }
    public void area(double radius) {
        System.out.println(Math.PI * radius * radius);
    }
}