package com.javabase.extend_;

/**
 * 继承的本质
 * 涉及文件：ExtendsTheory.java
 * 类加载顺序：从上之下.
 * 在堆中开辟空间，建立属性引用关系：从上到下.
 * 在栈中分配对象引用变量，指向堆空间.
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        // 按照查找关系返回信息：
        // - 查看子类，若子类有该属性并且可以访问，返回该信息，反之向上查找（若有该属性但不允许访问不会再向上查找，直接报错).
        // - 对父类执行相同操作直至顶级父类.
        System.out.println(son.name);// 大头儿子
        System.out.println(son.getAge());// 39
        System.out.println(son.hobby);// 旅游

    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 80;
}

class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;
    // int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";
}