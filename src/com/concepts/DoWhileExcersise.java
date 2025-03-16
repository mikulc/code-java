package com.concepts;

public class DoWhileExcersise {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 9) {
            while (j <= i) {
                System.out.println(i + "*" + j + "=" + i * j);
                j++;
            }
            
            i++;
        }
    }
}
