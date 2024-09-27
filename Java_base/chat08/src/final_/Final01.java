package final_;
/*
  final可以修饰类 属性 方法和局部变量
  1. 不希望类被继承 可以用final修饰
  2. 不希望父类某个方法被子类重写
  3. 不希望类的某属性被修改
  4. 不希望某个局部变量被修改
 */

public class Final01 {
    public static void main(String[] args) {
        C c = new C();
//        c.TAX_RATE = 0.02;

    }
}

// 要求A类不能被其他类继承
final class A { }

//class B extends class A {}

class C {
    public final double TAX_RATE = 0.08;
    public final void hi() {}
    public void cry() {
        final double NUM = 0.01;
//        NUM = 0.9;
    }
}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("重写方法...");
//    }
}