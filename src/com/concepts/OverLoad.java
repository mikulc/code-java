package com.concepts;

public class OverLoad {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        double res = myCalculator.calculate(2.0, 3);
        System.out.println(res);
    }
}

class MyCalculator {
    //计算两数之和
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
    //计算一个整数和一个double的和
    public double calculate(int n1, double n2) {
        return n1 + n2;
    }
    //计算一个double和一个整数的和
    public double calculate(double n1, int n2) {
        return n1 + n2;
    }
    //计算三个数之和
    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}