package com.javabase.encap;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account();
        account.setName("Jack");
        account.setBalance(50.6);
        account.setPasswd("147852");
        account.info();

        Account account1 = new Account("zhou", 88, "200107");
        account1.info();

    }
}
