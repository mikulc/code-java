package com.exercise20240425;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //输入行和列，打印一个形状
        Scanner sc= new Scanner(System.in);
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