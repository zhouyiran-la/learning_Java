package com.javabase.super_;

public class B extends A{

    public int n1 = 888;
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        // private方法无法访问
//        super.test400();
    }

    public void cal() {
        System.out.println("B类的cal() 方法...");
    }

    public void sum() {
        System.out.println("B类的sum()方法....");
        // 调用父类的cal方法
        cal(); //先找本类 再找父类 ... Object类
        this.cal();
        super.cal(); //找父类 ... Object类

        System.out.println(this.n1);
        System.out.println(n1);
        System.out.println(super.n1);
    }

    public B() {
        super();
//        super("jack")
//        super("jack", 18)
    }
}
