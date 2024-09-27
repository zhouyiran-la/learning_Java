package abstract_;

/*
* 1. 解决父类方法不确定的问题，如果类中有方法功能尚不明确，可以讲方法声明为抽象方法，其类为抽象类
* 2. 抽象方法没有方法体
* 3. 一般来说，抽象类会被继承，由其子类实现抽象方法
*
* */
public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}