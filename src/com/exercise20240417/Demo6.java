package com.exercise20240417;

public class Demo6 {
    public static void main(String[] args) {
        //输出A-Z和a-z字母
        for (char letterLow = 'a'; letterLow <= 'z'; letterLow++) {
            System.out.print(letterLow + "\t");
        }
        System.out.println();
        for (char letterUp = 'Z'; letterUp >= 'A'; letterUp--) {
            System.out.print(letterUp + "\t");
        }
    }
}
