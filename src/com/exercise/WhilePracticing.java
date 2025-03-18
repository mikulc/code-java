package com.exercise;

/**
 * while练习
 * 计算一个人可以经过多少次收费站
 *
 * @since 2024-04-17
 */
public class WhilePracticing {
    public static void main(String[] args) {
        int money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
//                money -= money * 0.05;
                money *= 0.95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
        }
        System.out.println("此人经过了" + count + "次," + "剩下了" + money + "元");
    }
}
