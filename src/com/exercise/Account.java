package com.exercise;

/**
 * 封装的练习
 *
 * @since 2024-05-04
 */
public class Account {
    private String name;
    private double balance;
    private String password;

    //提供两构造器
    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("你输入的名字格式不正确！");
            this.name = "null";
        }
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("你输入的薪水范围不正确！");
            this.balance = 21;
        }
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码必须为6位");
            this.password = "123456";
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public void info() {
        System.out.println(name);
        System.out.println(password);
        System.out.println(balance);
    }
}