/**
 * 构造方法
 * 构造方法是类的一种特殊方法，主要作用是完成新对象的初始化，特点如下:
 * - 方法名和类名相同
 * - 没有返回值
 * 
 * 语法：
 * [修饰符]方法名(形参列表) {
 *      方法体
 * }
 * 
 */


public class Constructor {
    public static void main(String[] args) {
        ConstructorPerson p1 = new ConstructorPerson("周依然", 22);
        System.out.println(p1.name + " " + p1.age);
    }
     
}

class ConstructorPerson {

    String name;
    int age; 

    // 构造方法
    public ConstructorPerson(String pName, int pAge) {

        System.out.println("构造方法被调用");
        name = pName;
        age = pAge;
    }
    // 构造器重载
    public ConstructorPerson(String pName) {

        System.out.println("构造方法被调用");
        name = pName;
    }
    // 显示定义默认构造器
    ConstructorPerson() {

    }
}
