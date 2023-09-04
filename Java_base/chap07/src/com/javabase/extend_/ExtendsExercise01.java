package com.javabase.extend_;

// 说出以下代码的输出结果
public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("a");
    }
    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }
    B(String name) {
        // 隐藏语句
        // super();
        System.out.println("b name");
    }
}