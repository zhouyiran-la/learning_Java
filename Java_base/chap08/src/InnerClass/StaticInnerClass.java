package InnerClass;

/*
* 静态内部类
* 1. 定义在外部类的成员位置，有static修饰符
* 2. 可以直接访问外部类的所有静态成员，包含私有的，不能访问非静态成员
* 3. 可以添加任意访问修饰符
* 4. 作用域为整个类体
* 5. 内部类可以直接访问外部类，外部类需要创建对象然后访问内部类成员
* 6. 外部其他类也可以访问成员内部类
*    - 外部类.内部类 对象名 = new 外部类名.内部类() // 类名可以直接访问
*    - 在外部类中定义返回内部类实例的方法
* 7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员
     可以使用外部类名.成员去访问
* */

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer07.Inner07 inner07 = new Outer07.Inner07();
        inner07 = Outer07.getInner07Instance();
        inner07.say();
    }
}

class Outer07 {
    private static int n1 = 10;
    public static String name = "张三";
    public static class Inner07 {
        private static int n1 = 20;
        public void say() {
            System.out.println("name=" + name);
            System.out.println("n1=" +  n1);
            System.out.println("n1=" +  Outer07.n1);
        }


    }

    public void t1() {
        Inner07 inner08 = new Inner07();
        inner08.say();
    }
    // 也可以定义非静态方法 看自己的需求
    public static Inner07 getInner07Instance() {
        return new Inner07();
    }

}
