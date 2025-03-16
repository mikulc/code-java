package com.exercise20240417;

public class Demo8 {
    public static void main(String[] args) {
        /*
        求（0+1）+（1+2）+（1+2+3）+...+（1+..+100）的结果

        int sum = 0;
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            result += sum;
        }
        System.out.println("结果是：" + result);
        */

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
