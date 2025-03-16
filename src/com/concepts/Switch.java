package com.concepts;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符（a-d）:");
        char letter = sc.next().charAt(0);

        switch (letter) {
            case 'a' :
                System.out.println("今天是星期一");
                break;
            case 'b' :
                System.out.println("今天是星期二");
                break;
            default:
                System.out.println("输入错误");
        }
        System.out.println("switch退出");
    }
}
