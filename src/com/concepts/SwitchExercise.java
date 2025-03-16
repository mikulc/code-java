package com.concepts;
import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] ages) {
        Scanner sc = new Scanner(System.in);
        //对于学生成绩大于60分的，输出“合格”，低于60分的输出不合格，输出成绩不能大于100，要求使用switch
//        System.out.print("请输入学生成绩：");
//        double score = sc.nextDouble();
//
//        if (score >= 0 && score <= 100) {
//            switch ((int)(score / 60)) {
//                case 0 :
//                    System.out.println("不及格！");
//                    break;
//                case 1 :
//                    System.out.println("及格！");
//                    break;
//                default:
//                    System.out.println("输入有误！");
//            }
//        }else {
//            System.out.println("输入有误!");
//        }


        //穿透的应用
        //输入一个月份来判断季节
        System.out.print("请输入一个月份：");
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("这个春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("这是冬季");
                break;
            default:
                System.out.println("你输入的月份不对");
        }

    }
}
