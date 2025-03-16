package com.concepts;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //%的本质：a % b = a - a / b * b

        //10 % -3
        System.out.println(10 - (10 / -3) * -3); //1
        //-10 % 3
        System.out.println(-10 - (-10 / 3) * 3); //-1
        //-10 % -3
        System.out.println(-10 - (-10 / -3) * -3); //-1


        //exercise01
        int i = 1;
        i = i ++;
        System.out.println(i);

    }
}
