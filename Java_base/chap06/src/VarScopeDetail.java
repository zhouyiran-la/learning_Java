/**
 * 变量作用域细节
 * 细节一：全局变量(属性)和局部变量可以重名，访问时遵循就近原则.
 * 细节二：在同一作用域中两变量不能重名.
 * 细节三：全局变量生命周期长，伴随着对象的创建而创建，对象的销毁而销毁；
 * 局部变量生命周期短，伴随着代码块的执行而创建，代码块的结束而销毁.
 * 细节四：全局变量可以被本类和其他类（对象调用）使用.
 * 细节五：全局变量可以加修饰符，局部变量不能加修饰符.
 */

public class VarScopeDetail {
    public static void main(String[] args) {

        VarScopeDetailPerson p1 = new VarScopeDetailPerson();
        p1.say();

        VarScopeDetailPerson2 p2 = new VarScopeDetailPerson2();
        p2.test();
        p2.test2(p1);

    }
    
}

class VarScopeDetailPerson {

    // private int age = 20;
    String name = "Jack";

    public void say() {

        String name = "King";
        System.out.println("say: name=" + name);// King
    }
}

class VarScopeDetailPerson2 {

    public void test() {
        VarScopeDetailPerson p1 = new VarScopeDetailPerson();
        System.out.println(p1.name);
    }
    public void test2(VarScopeDetailPerson p1) {
        System.out.println(p1.name);
    }
}
