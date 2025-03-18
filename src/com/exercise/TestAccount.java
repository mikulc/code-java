package com.exercise;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Jayson");
        account.setBalance(21);
        account.setPassword("123456");

        account.info();
    }
}
