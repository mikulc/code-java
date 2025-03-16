package com.exercise;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //根据淡季和旺季和年龄来确定票价
        Scanner sc = new Scanner(System.in);
        boolean season = true;  //true 为旺季，false 为淡季
        int price = 60;
        if (season) {
            System.out.print("请输入你的年龄：");
            int age = sc.nextInt();
            if (age > 0) {
                if (age < 60 && age >= 18) {
                    System.out.println("票价为：" + price);
                } else if (age < 18) {
                    System.out.println("票价为：" + (price / 2));
                }else {
                    System.out.println("票价为：" + (price / 3));
                }
            }
        }else {
            System.out.print("请输入你的年龄：");
            int age = sc.nextInt();
            if (age > 0) {
                if (age < 60 && age >= 18) {
                    System.out.println("票价为：" + (price - 20));
                } else {
                    System.out.println("票价为：" + (price - 40));
                }
            }
        }
    }
}
