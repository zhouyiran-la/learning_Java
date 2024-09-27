package codeblock;

/* 当类之间有继承关系时，类调用顺序：
*  1. 父类的静态代码块和静态属性初始化
*  2. 子类的静态代码块和静态属性初始化
*  3. 父类的普通代码块和普通属性初始化
*  4. 父类的构造方法
*  5. 子类的普通代码块和普通属性初始化
*  6. 子类的构造方法
*
* 静态代码块只能直接调用静态成员，普通代码块可以调用任意成员
* */

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        A02 a02 = new B02();
    }
}

class A02 {
    private static int n1 = getVal01();
    static  {
        System.out.println("A02 静态代码块");
    }
    {
        System.out.println("A02 普通代码块");
    }
    private int n2 = getVal02();
    public static int getVal01() {
        // 先输出
        System.out.println("getN1被调用");
        return 10;
    }
    public int getVal02() {
        System.out.println("getN2被调用");
        return 10;
    }
    public A02() {
        System.out.println("A02 的无参构造器被调用");
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();
    static  {
        System.out.println("B02 静态代码块");
    }
    {
        System.out.println("B02 普通代码块");
    }
    private int n4 = getVal04();
    public static int getVal03() {
        // 先输出
        System.out.println("B02 getVal03被调用");
        return 10;
    }
    public int getVal04() {
        System.out.println("B02 getVal04被调用");
        return 10;
    }
    public B02() {
        System.out.println("B02 的无参构造器被调用");
    }
}

class C02 extends B02{
    private static int n3 = getVal05();
    static  {
        System.out.println("C02 静态代码块");
    }
    {
        System.out.println("C02 普通代码块");
    }
    private int n4 = getVal06();
    public static int getVal05() {
        // 先输出
        System.out.println("getVal05被调用");
        return 10;
    }
    public int getVal06() {
        System.out.println("getVal06被调用");
        return 10;
    }
    public C02() {
        System.out.println("C02的无参构造器被调用");
    }
}