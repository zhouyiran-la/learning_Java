package com.javabase.poly_.detail_;


import java.sql.SQLOutput;

public class PolyDetail {
    public static void main(String[] args) {
        // 向上转型
        Animal animal = new Cat();

        // 可以调用父类中的所有成员(需遵守访问权限)
        // 但是不能调用子类特有的成员
        // 因为在编译阶段，能调用哪些成员是由编译类型决定的
        // 最终运行效果看子类的具体实现，从运行类型开始查找
        animal.eat(); // 实际运行的是子类重写的方法
        animal.run();
        animal.sleep();
        animal.show();



        /*
        向下转型：
        1. 只能强转父类引用，不能强转父类对象
        2. 要求父类的引用必须指向的是当前目标类型的对象
        3. 当向下转型后，可以调用子类类型中的所有成员
        4. 子类类型 引用名 = (子类类型) 父类引用
         */
        // animal原先必须指向Cat对象
        Cat cat2 = (Cat) animal;
        // Dog dog = (Dog) animal; 错误
        cat2.catchMouse();

        // 属性没有重写之说
        System.out.println(animal.name); // 打印的时父类属性值”动物“
        System.out.println(cat2.name); // "小猫"

        // instance of 判断对象的运行类型
        System.out.println(cat2 instanceof Animal);
        System.out.println(cat2 instanceof Cat);
        System.out.println(animal instanceof  Cat); //true

    }
}
