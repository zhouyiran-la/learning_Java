package InnerClass;

/*
* 匿名内部类特点:
* 1. 本质是类 2. 是内部类 3. 无类名 4. 同时也是一个对象
*
* 若再单独创建类会很麻烦
* 语法：
* new 类或接口(参数列表) {
*   类体
* };
*
* 基于接口的匿名内部类的使用场景：需要某些类实现接口，但只需要调用一次后面便不再使用
* 基于抽象类的匿名内部类一定要实现抽象方法
* 匿名内部类不能写构造器
*
* */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.method();
    }
}

class Outer3 {
    private int n1 = 100;
    public void method() {

        // tiger是接口引用也可以看作是对象
        // tiger的编译类型是IA 运行类型是匿名内部类
        // 底层其实有个类实现了IA接口，名字为Outer3$1
        // JDK在创建匿名内部类后立即创建了其实例并且返回给tiger
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        System.out.println("Tiger的运行类型=" + tiger.getClass());
        // father编译类型Father father的运行类型是Outer$04
        // 底层有个Outer$02类继承了Father类
        Father father = new Father ("jack"){

            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        System.out.println("father的运行类型=" + father.getClass());
        father.test();

    }
}

interface IA {
    public void cry();
}

class Father {
    public Father(String name) {

    }

    public void test() {

    }
}
