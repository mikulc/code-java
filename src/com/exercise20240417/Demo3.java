package com.exercise20240417;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //判断是否是闰年
        Scanner sc  = new Scanner(System.in);

        System.out.print("请输入一个年份：");
        int year  = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年！");
        }else {
            System.out.println(year + "不是闰年！");
        }
    }
}
