package com.javabase.poly_.dynamic_;

/**
 * 动态绑定机制
 * 1. 调用对象方法的时候，该方法会和该对象的运行类型绑定
 * 2. 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
 */
public class DynamicBinding {
    public static void main(String[] args) {
        //不注释子类方法
        A a = new B();
        System.out.println(a.sum()); //40
        System.out.println(a.sum1()); //30

        // 注释掉子类sum()方法
        // 调用的子类的getI，父类的sum
        System.out.println(a.sum()); //30

        // 注释掉子类的sum1()方法
        // sum1直接调用的i属性，不存在动态绑定机制
        System.out.println(a.sum1()); //20
    }
}

class A {
    public int i = 10;

    public int getI() {
        return i;
    }

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }
}

class B extends A {
    public int i = 20;

//    @Override
//    public int sum() {
//        return i + 20;
//    }

    public int sum1() {
        return i + 10;
    }

    @Override
    public int getI() {
        return i;
    }
}
