package com.concepts;
import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //一个经典的编程思想,
        int[] seq = {1, 2, 3, 4};
        System.out.print("请输入一个数字：");
        int num = sc.nextInt();

        int index = -1;   //定义一个变量，如果在循环结束后还没有找到，则该数字就不变
        for (int i = 0; i < seq.length; i++) {
            if (num == seq[i]) {
                System.out.println("找到了，该数字的索引为：" + i);
                index++;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有找到该数字！");
        }
    }
}
