package com.exercise20240504;

public class Demo6 {
    public static void main(String[] args) {
        Cale cale = new Cale();
        System.out.println("除：" + cale.div(1, 0));
        System.out.println("差：" + cale.sub(1, 2));
        System.out.println("乘：" + cale.mul(1, 2));
        System.out.println("和：" + cale.sum(1, 2));
    }
}

class Cale {
    public double sum(double n1, double n2) {
        return  n1 + n2;
    }
    public double sub(double n1, double n2) {
        return n1 - n2;
    }
    public double mul(double n1, double n2) {
        return n1 * n2;
    }
    public Double div(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("被除数为0");
            return null;
        }
        return n1 / n2;
    }
}
