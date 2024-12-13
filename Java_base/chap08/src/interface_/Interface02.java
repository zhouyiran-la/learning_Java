package interface_;
/*
* jdk7.0以前接口中的方法没有方法体,都是抽象方法
* jdk8.0后接口中可以有静态方法、默认方法
* */
public class Interface02 {
    public static void main(String[] args) {
        new A();

    }
}

interface interf01 {
    // 接口中有属性
    int n1 = 10;
    int n2 = say();

    // 接口中abstract可以省略
    void hi();
    // 默认实现方法需要有default关键字修饰
    default public void ok() {
        System.out.println("ok");
    }

    public static void cry() {
        System.out.println("cry ...");
    }

    public static int say() {
        System.out.println("inter01 静态方法被调用");
        return 10;
    }
}

class A implements interf01 {
    public A() {
        System.out.println("A类构造器被调用");
    }

    public void hi() {
        System.out.println("hi");
    }

}


