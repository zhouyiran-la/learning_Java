/**
 * (1) 一个类可以定义多个不同的构造器，即构造器重载.
 * (2) 如果程序员没有指定构造方法，系统会自动给类生成一个默认无参构造方法(可以反编译(javap).class文件查看)：
 * eg. Person() {}
 * (3) 一旦自定义构造方法，默认构造方法会被覆盖无法使用，除非自己再额外显示定义.
 * 
 * 对象创建的流程：
 * - 加载类信息
 * - 在堆中分配空间
 * - 完成对象初始化[默认初始化、显示初始化、构造器初始化]
 * - 将堆中对象地址返回给栈空间中对象引用
 */

public class ConstuctorDetail {
    public static void main(String[] args) {

        // ConstructorPerson--Constructor.java
        ConstructorPerson p1 = new ConstructorPerson("周依然");
        System.out.println(p1.name + " " + p1.age);

        // 调用默认构造方法
        ConstructorPerson p2 = new ConstructorPerson();
        System.out.println(p2);

    }
}
