package InnerClass;
// 局部内部类

/*
* 1. 能够直接访问外部类所有成员，包括私有成员
* 2. 不能添加访问修饰符，局部内部类相当于局部变量，可以使用final修饰
* final修饰的内部类不能被继承
* 3. 作用域仅仅在定义他的方法或者代码块中
* 4. 局部类直接访问外部类成员
* 5. 外部类创建内部类对象 访问内部类成员
* 6. 外部其他类不能访问局部内部类
* 7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员
* 可以使用外部类名.this.成员去访问
* */

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m1();
        System.out.println("Outer2的hashcode=" + outer2.hashCode());
    }
}

class Outer2 {
    private int n1 = 100;
    private void m2() {
        System.out.println("Outer2 m2");
    }
    public void m1() {
        // 定义局部内部类
        class Inner2 {
            private int n1 = 800;
            public void f1() {
                // Outer02.this本质就是外部类的对象,即哪个对象调用了m1
                System.out.println("n1=" + Outer2.this.n1);
                System.out.println("Outer2.this hashcode=" + Outer2.this.hashCode());
                m2();
            }
        }

        Inner2 inner2 = new Inner2();
        inner2.f1();

    }

    {
        class Inner3 {

        }
    }

}
