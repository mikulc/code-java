package com.concepts;

public class StringToBasic {
    public static void main(String[] args) {
        //将字符串转换为基本数据类型
        String s1 = "123";
        int num1  = Integer.parseInt(s1);
        double num2  = Double.parseDouble(s1);
        float num3 = Float.parseFloat(s1);
        long num4 = Long.parseLong(s1);
        byte num5 = Byte.parseByte(s1);
        short num6 = Short.parseShort(s1);
        boolean b = Boolean.parseBoolean(s1);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(b);

        //将字符串s1的第一个字符返回
        System.out.println(s1.charAt(0));
    }
}
