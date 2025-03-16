package com.concepts;
import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        do {
            int[] arrNew = new int[arr.length - 1];

            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
                System.out.print(arrNew[i] + "\t");
            }
            System.out.println();
            arr = arrNew;
            System.out.print("你是否需要继续缩减(y/n)？");
            char key = sc.next().charAt(0);
            if (arr.length == 1) {
                System.out.println("不能再缩减了！");
                break;
            } else if (key == 'n') {
                break;
            }
        } while (true);
    }
}
