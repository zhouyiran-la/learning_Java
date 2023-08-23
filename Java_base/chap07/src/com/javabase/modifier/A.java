package com.javabase.modifier;

/*
访问修饰符如下：
public -- 公开（同类，同包，子类， 不同包）
protected -- 无法跨包访问（同类，同包，子类）
默认 -- 同包、同类访问
private -- 同类访问

细节：
- 修饰符可以修饰类、属性、成员方法.
- 只有public和默认修饰符能修饰类.
 */

public class A {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    // 同一类中可以访问任何访问修饰符修饰的类、属性和方法.
    public void fuc() {
        System.out.println("n1=" + n1 + "n2=" + n2 + "n3=" + n3 + "n4=" + n4);
    }

}
