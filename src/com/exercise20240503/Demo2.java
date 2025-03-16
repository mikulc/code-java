package com.exercise20240503;

public class Demo2 {
    public static void main(String[] args) {
        Methods1 methods1 = new Methods1();

        System.out.println(methods1.max(3.0, 6, 6.3));
    }
}

class Methods1 {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }
    public double max(double a, double b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }
    //比较三个浮点数的最大值
    public double max(double a, double b, double c) {
        double maxNum = (a > b) ? a : b;
        return (maxNum > c) ? maxNum : c;
    }
}