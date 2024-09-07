package com.javabase.Object_;

/**
 * ==
 * 1. 既可以判断基本类型，又可以判断引用类型
 * 2. 如果判断基本类型，判断的是值是否相等
 * 3. 如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象
 * equals
 * 1. 只能判断引用类型
 * 2. 默认判断地址是否相等，子类可以重写该方法，用于判断内容是否相等，
 * Integer、String都重写了该方法。
 */

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        A d = new A();

        System.out.println(a == c);
        System.out.println(b == c);
        B Bobj = a;
        System.out.println(Bobj == c);
        System.out.println(Bobj.equals(c));
        // 地址类型不一样 false
        System.out.println(a == d);// false
        Integer num1 = new Integer(1000);
        Integer num2 = new Integer(1000);
        // Integer重写了该方法
        System.out.println(num1.equals(num2));
        String str1 = new String("hspedu");
        String str2 = new String("hspedu");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));




    }


}



class A extends B {

}

class B {

}
