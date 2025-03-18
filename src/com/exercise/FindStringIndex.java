package com.exercise;

/**
 * 查找字符串下表索引
 *
 * @since 2024-05-04
 */
public class FindStringIndex {
    public static void main(String[] args) {
        String[] str = {"Jay", "Mike", "Jury"};
        A02 a02 = new A02();
        System.out.println("该字符串的下标索引是：" + a02.find("Jay", str));
    }
}

class A02 {
    public int find(String findString, String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (findString.equals(str[i])) {
                return i;
            }
        }
        return -1;
    }
}