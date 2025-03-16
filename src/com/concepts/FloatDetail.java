package com.concepts;

public class FloatDetail {
    public static void main(String[] args) {
        double num1 = 2.7;
        double num2 = 8.1 / 3;

        System.out.println(num1);
        System.out.println(num2);
        //判断这两个数的正确写法，两个差值非常小，小到我规定的范围就认为这两个数相等
        if (Math.abs(num1 - num2) < 0.0000001) {
            System.out.println("相等");
        }
    }
}
