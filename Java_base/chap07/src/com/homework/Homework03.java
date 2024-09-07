package com.homework;

public class Homework03 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(100);
//        System.out.println("余额是" + checkingAccount.getBalance());
//        checkingAccount.withdraw(200);
//        System.out.println("余额是" + checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println("余额是" + savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println("余额是" + savingsAccount.getBalance());

        savingsAccount.earnMonthlyInterest();
        System.out.println("余额是" + savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        System.out.println("余额是" + savingsAccount.getBalance());
    }
}

class BankAccount{
    private double balance;//余额
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
   public void deposit(double amount) {
        balance += amount;
   }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        // 扣1元手续费
        super.deposit(amount - 1);
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}

class SavingsAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.01;


    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }
}




