package com.exercise20240502;

public class Demo4 {
    public static void main(String[] args) {
        //一个猴子第一天吃下当前桃子的一半并多吃了一个，第十天刚准备想吃的时候发现只剩1一个，求一共有多少个桃子
        Fruit f = new Fruit();
        int res = f.peach(7);
        System.out.println(res);
    }
}

class Fruit {
    public int peach(int day) {
        if (day == 10) {
            return 1;
        }else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        }else {
            System.out.println("输入错误！");
            return 0;
        }
    }
}
