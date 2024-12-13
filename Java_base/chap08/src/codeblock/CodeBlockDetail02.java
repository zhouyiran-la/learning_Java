package codeblock;
/*
* 创建对象时，同一个类的调用顺序：
* 1. 静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块
* 和多个静态变量初始化，则按他们的定义顺序调用
*
* 2. 普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和
* 多个普通属性初始化，则按定义顺序调用
*
* 3. 最后调用构造器
* 4. 构造器的最前面隐含了super()和调用普通代码块 静态代码块和静态属性再类加载时就已经调用完成
*
* */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    private int n2 = getN2();
    {
        // 后输出
        System.out.println("A 普通代码块");
    }
    private static int n1 = getN1();
    static  {
        // 后输出
        System.out.println("A 静态代码块");
    }

    public static int getN1() {
        // 先输出
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用...");
        return 200;
    }
    public A() {
        System.out.println("A 的无参构造器被调用");
    }
}