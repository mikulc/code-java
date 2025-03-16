package com.concepts;

public class BitOperator03 {
    public static void main(String[] args) {
        //右移运算符，将200的补码整体向右移两位，高位的第一位原来是正数就是1，第二位补零相当于除以4
        int a = 200;
        int s = -200;
        System.out.println(a >> 2);
        System.out.println(s >> 2);

        //左移运算符，将200的补码整体向左移两位，高位都补零，相当于乘4
        int b = 200;
        System.out.println(a << 2);

        //无符号右移，无论原来是正数还是负数，高位都是补零
        int c = 200;
        System.out.println(a >> 2);

        int d = -200;
        System.out.println(a >> 2);
    }
}
