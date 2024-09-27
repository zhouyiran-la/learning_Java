package InnerClass;

/*
* 成员内部类
* 1. 定义在外部类的成员位置
* 2. 可以直接访问外部类的所有成员，包含私有的
* 3. 可以添加任意访问修饰符
* 4. 作用域为整个类体
* 5. 内部类可以直接访问外部类，外部类需要创建对象然后访问内部类成员
* 6. 外部其他类也可以访问成员内部类
*    - 外部类.内部类 对象名 = 对象名.new 内部类()
*    - 在外部类中定义返回内部类实例的方法
* 7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员
     可以使用外部类名.this.成员去访问
* */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.t1();
        Outer06.Inner06 inner06 = outer06.new Inner06();
        Outer06.Inner06 inner06Instance = outer06.getInner06Instance();
    }
}


class Outer06 {
    private int n1 = 10;
    public String name = "张三";
    public class Inner06 {
        private int n1 = 20;
        public void say() {
            System.out.println("n1=" + n1 + " name=" + name);
            System.out.println("n1=" + Outer06.this.n1 + " name=" + name);
        }


    }

    public void t1() {
        Inner06 inner08 = new Inner06();
        inner08.say();
    }

    public Inner06 getInner06Instance() {
        return new Inner06();
    }



}