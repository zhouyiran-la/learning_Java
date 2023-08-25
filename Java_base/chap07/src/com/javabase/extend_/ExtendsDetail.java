package com.javabase.extend_;

/*
继承使用细节
- 子类继承父类所有属性和方法，但私有属性和方法无法直接访问，需要通过公共的方法.
-
 */
public class ExtendsDetail {
    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.sayOk();
    }
}
