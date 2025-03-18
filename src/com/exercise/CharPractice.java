package com.exercise;

/**
 * 字符练习
 * 输出A-Z和a-z字母
 *
 * @since 2024-04-17
 */
public class CharPractice {
    public static void main(String[] args) {
        for (char letterLow = 'a'; letterLow <= 'z'; letterLow++) {
            System.out.print(letterLow + "\t");
        }
        System.out.println();
        for (char letterUp = 'Z'; letterUp >= 'A'; letterUp--) {
            System.out.print(letterUp + "\t");
        }
    }
}
