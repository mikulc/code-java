package com.exercise20240504;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你需要修改的价格:");
        double price = sc.nextInt();
        Book book = new Book(70);
        System.out.println("书本价格更新后的结果是：" + book.updatePrice(price));
    }
}

class Book {
    int bookPrice;

    public Book(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double updatePrice(double updatePrice) {
        if (updatePrice > 150) {
            this.bookPrice = 150;
        }else if (updatePrice > 100) {
            this.bookPrice = 100;
        }
        return bookPrice;
    }
}