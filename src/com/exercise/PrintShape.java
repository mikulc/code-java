package com.exercise;

import java.util.Scanner;

/**
 * 利用方法打印一个形状
 * 输入行和列，打印一个形状
 *
 * @since 2024-04-25
 */
public class PrintShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入有多少row:");
        int row = sc.nextInt();

        System.out.print("请输入有多少column:");
        int column = sc.nextInt();

        System.out.print("请输入char:");
        char c1 = sc.next().charAt(0);

        Print p1 = new Print();
        p1.printChar(row, column, c1);
    }
}

class Print {
    public void printChar(int row, int column, char a) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}