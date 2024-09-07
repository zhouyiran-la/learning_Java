package com.javabase.override_;

/**
 * 1. 子类方法的参数、方法名称要和父类方法完全一致
 * 2. 子类方法的返回类型与父类方法一致，或者为父类返回类型的子类
 * 3. 子类方法不能缩小父类方法的访问权限
 */
public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    } 
}
