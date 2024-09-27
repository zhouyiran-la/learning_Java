package InnerClass;

/*
* 1. 两种调用方式
*
* 1. 能够直接访问外部类所有成员，包括私有成员
* 2. 不能添加访问修饰符，局部内部类相当于局部变量，可以使用final修饰
* final修饰的内部类不能被继承
* 3. 作用域仅仅在定义他的方法或者代码块中
* 4. 局部类直接访问外部类成员
* 6. 外部其他类不能访问局部内部类
* 7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员
     可以使用外部类名.this.成员去访问


* */

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {

    }
}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        Person p = new Person() {
            @Override
            public void hi() {
                System.out.println("HaHaHaHa");
            }
        };

        p.hi();
        // 两者等价
        new Person() {
            @Override
            public void hi() {
                System.out.println("hhhhhh");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");

    }
}


class Person {
    public void hi() {
        System.out.println("Person hi");
    }

    public void ok(String str) {
        System.out.println("Person ok" + str);
    }
}