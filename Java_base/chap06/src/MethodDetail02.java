/*
 * 成员方法注意事项和使用细节
 * (5) 同一个类中方法可以直接调用
 * (6) 跨类方法调用需要通过对象名:对象名.方法名(与访问修饰符相关)
 */
public class MethodDetail02 {

    public static void main(String[] args) {
        A a = new A();
        a.sayOk();
        a.sayHi();
    }
}

class A {

    public void print(int n) {
        System.out.println("print()方法被调用，n=" + n);
    }

    public void sayOk() {
        print(10);
        System.out.println("继续执行sayOk()");
    }

    public void sayHi() {
        // 跨类调用方法
        B b = new B();
        b.hi();
    }
}

class B {

    public void hi() {
        System.out.println("执行B类中的hi()方法");
    }
}
