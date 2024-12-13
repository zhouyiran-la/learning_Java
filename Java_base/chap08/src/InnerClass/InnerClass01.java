package InnerClass;

/*
* 1. 类的五大成员：属性 方法 构造器 代码块 内部类
* 2. 内部类可以直接访问私有属性，并可以体现类与类之间的包含关系
* 分类（定义位置）
* 1. 定义在外部类的局部位置上（方法体、代码块等）
* - 局部内部类（有类名）
* - 匿名内部类（无类名）
* 2. 定义在外部类的成员位置上
* - 成员内部类（无static）
* - 静态内部类（有static）
* */
public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 100;
    public void m1() {
        System.out.println("m1()");
    }
    {
        System.out.println("普通带买块");
    }

    public Outer(int n1) {
        this.n1 = n1;
    }
    // 内部类
    class Inner{}

}
