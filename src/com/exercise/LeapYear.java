package com.exercise;

import java.util.Scanner;

/**
 * 判断是否是闰年
 *
 * @since 2024-04-17
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个年份：");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年！");
        } else {
            System.out.println(year + "不是闰年！");
        }
    }
}
