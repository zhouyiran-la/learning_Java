package com.javabase.Object_;

/**
 * 1. 当对象被回收时，系统自动调用该对象的finalize方法。子类可以重写该方法，
 * 做一些释放资源的操作（数据库连接，打开文件）
 * 2. 当某个对象没有任何引用时，jvm认为该对象时垃圾对象，会使用垃圾回收机制来销毁对象。
 * 销毁对象前，会调用finalize方法
 * 3. 垃圾回收机制由系统来决定，但也可以通过System.gc主动触发
 */
public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        //对象引用置空
        bmw = null;
        System.gc();
        System.out.println("程序退出了...");

    }
}
class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
        System.out.println("释放了某些资源...");
    }
}
