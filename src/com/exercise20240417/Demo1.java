package com.exercise20240417;

public class Demo1 {
    public static void main(String[] args) {
        //计算一个人可以经过多少次收费站
        int money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
//                money -= money * 0.05;
                money *= 0.95;
                count++;
            }else if (money >= 1000){
                money -= 1000;
                count++;
            }else {
                break;
            }
        }
        System.out.println("此人经过了" + count + "次," + "剩下了" + money +"元");
    }
}
