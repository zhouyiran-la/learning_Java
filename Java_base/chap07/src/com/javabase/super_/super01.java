package com.javabase.super_;


/**
 * 1. 访问父类属性 不能访问private属性
 * 2. 访问父类方法 不访问private方法
 * 3. 访问父类构造器 只能放在构造器第一句
 */

public class super01 {
    public static void main(String[] args) {
        B b = new B();
        b.sum();

    }
}
