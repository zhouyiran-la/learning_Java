package abstract_;

/*
  1. 抽象类不能被实例化
  2. 抽象类不一定包含抽象方法，但是有抽象方法必须要声明为抽象类
  3. abstract只能修饰类和方法
  4. 抽象类本质也是类，可以拥有任意成员
  5. 抽象方法不能有主体
  6. 如果一个类继承了一个抽象类，其必须实现抽象类的所有抽象方法
  7. 抽象方法不能用private、final和static来修饰（与重写相违背）
* */
public class AbstractDetail {
    public static void main(String[] args) {
//         new A();
    }
}

abstract class A {

    public int n1 = 10;
    public static String name = "韩顺平教育";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
    }

}

class B extends A {
    @Override
    public void hello() {
        System.out.println("hello");
    }
}

