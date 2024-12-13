package homework;

/**
 * @author zyr
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();

    }
}

class A {
    private String name = "hello";
    public void f1() {
        class B {
            private final String NAME = "zhouzhou";
            public void show() {
                System.out.println("name=" + NAME);
                System.out.println("name=" + A.this.name);
            }
        }

        B b = new B();
        b.show();


    }
}
