package com.concepts;
import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        //数组扩容，效率低
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        do {
            int[] arrNew = new int[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }

            System.out.print("请输入你要添加的数字：");
            int addNum = sc.nextInt();
            arrNew[arrNew.length - 1] = addNum;

            arr = arrNew;
            for (int j = 0; j < arrNew.length; j++) {
                System.out.println(arr[j]);
            }

            System.out.print("你是否还需要添加数字（y/n）？");
            char key = sc.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
    }
}
