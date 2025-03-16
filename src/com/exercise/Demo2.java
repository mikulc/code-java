package com.exercise;
import javax.swing.*;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        //在屏幕上显示弹窗
                int n = 0;
                Random rd = new Random();
                while (n < 300){
                    JFrame frame =new JFrame("哈哈哈");
                    frame.setSize(400,100);
                    frame.setLocation(rd.nextInt(1920),rd.nextInt(1080));
                    frame.setVisible(true);
                    frame.setResizable(false);
                    n++;
                }
    }
}
