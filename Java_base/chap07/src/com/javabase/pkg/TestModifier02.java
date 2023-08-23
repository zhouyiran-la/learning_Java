package com.javabase.pkg;

import com.javabase.modifier.A;

public class TestModifier02 {
    public static void main(String[] args) {
        A a = new A();
        // 跨包只能访问public修饰的类、属性或方法.
        System.out.println("n1=" + a.n1);
    }
}
