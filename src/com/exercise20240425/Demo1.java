package com.exercise20240425;

public class Demo1 {
    public static void main(String[] args) {
        AA a = new AA();
        Boolean res = a.isOdd(2);
        System.out.println(res);
    }
}
//判断一个数是否是奇数
class AA {
    public boolean isOdd(int a) {
        return a % 2 != 0;
    }
}
