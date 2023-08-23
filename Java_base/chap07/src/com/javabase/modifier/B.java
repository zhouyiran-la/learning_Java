package com.javabase.modifier;

public class B {
    public void fuc() {

        A a = new A();
        // 在同一包中无法访问private属性.
        System.out.println("n1=" + a.n1 + "n2=" + a.n2 + "n3=" + a.n3);
    }
}
