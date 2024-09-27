package static_;

public class VisitStatic {
    public static void main(String[] args) {
        //类变量不依赖对象实例
        System.out.println(A.name);
        A a = new A();
        // 通过对象名.类变量名访问（须遵守访问权限）
        System.out.println("a.name=" + a.name);

    }
}

class A {
    public static String name = "11111";
}
