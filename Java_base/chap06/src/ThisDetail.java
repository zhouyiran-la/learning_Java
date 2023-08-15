/**
 * this使用细节
 * (1) this关键字可以用来访问本类的属性、方法、构造器
 * (2) this用于区分当前类的属性和局部变量
 * (3) 访问成员方法：this.方法名(参数列表)
 * (4) 访问构造器语法：this(参数列表), 只能在构造方法中调用且必须为第一条语句.
 * (5) this不能在类定义的外部使用
 */

public class ThisDetail {
    public static void main(String[] args) {
        
        ThisDetailExample obj1 = new ThisDetailExample();
        obj1.f2();
    }
}

class ThisDetailExample {

    public ThisDetailExample() {
                
        this("Jack", 100);
        System.out.println("ThisDetailExample()");
        // 
        
    }

    public ThisDetailExample(String name, int age) {
        System.out.println("ThisDetailExample(String name, int age)");
    }

    public void f1() {
        System.out.println("f1()");
    }

    public void f2() {
        System.out.println("f2()");
        // 调用本类f1()

        // 第一种方法
        f1();
        // 第二种方法
        this.f1();
    }
}