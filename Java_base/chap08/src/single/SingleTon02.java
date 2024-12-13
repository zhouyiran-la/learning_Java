package single;

/*
 * 单例设计模式--懒汉式
 * 1. 构造器私有化
 * 2. 类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 * 饿汉式在类加载时就创建了
 * 饿汉式不存在线程安全问题，懒汉式存在
 * 饿汉式存在资源浪费的可能，可能会造成创建了对象但没有使用，懒汉式没有这个问题
 * */

public class SingleTon02 {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        Cat cat2 = Cat.getInstance();
    }
}

class Cat {
    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
        System.out.println("构造器被调用");
    }
    // 需要时被创建
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }
}