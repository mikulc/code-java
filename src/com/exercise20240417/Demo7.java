package com.exercise20240417;

public class Demo7 {
    public static void main(String[] args) {
        //计算（1/1）-（1/2）+...+(1/100)的结果
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            }else {
                sum += 1.0 / i;
            }
        }
        System.out.println("结果是：" + sum);
    }
}
