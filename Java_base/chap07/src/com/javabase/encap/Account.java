package com.javabase.encap;

class Account {
    String name;
    double balance;
    String passwd;

    public Account() {
    }

    public Account(String name, double balance, String passwd) {
        setName(name);
        setBalance(balance);
        setPasswd(passwd);
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度必须为2-4个字符，默认值张三.");
            this.name = "张三";
        }
    }

    public void setBalance(double balance) {

        if(balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
        }
    }

    public void setPasswd(String passwd) {
        if(passwd.length() == 6) {
            this.passwd = passwd;
        } else {
            System.out.println("密码必须为6位，默认值123456.");
            this.passwd = "123456";
        }

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPasswd() {
        return passwd;
    }

    public void info() {
        System.out.println("name=" + name + " balance=" + balance);
    }
}
