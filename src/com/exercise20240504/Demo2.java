package com.exercise20240504;

public class Demo2 {
    public static void main(String[] args) {
        String[] str = {"Jay", "Mike", "Jury"};
        A02 a02 = new A02();
        System.out.println("该字符串的下标索引是：" + a02.find("Jury", str));
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