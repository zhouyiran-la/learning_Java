/*
 * 属性的使用细节
 * (1) 简单介绍访问修饰符：访问修饰符 属性类型 属性名
 *     (public, protected, private, 默认)
 * (2) 属性的定义类型可以为任意类型，包含基本数据类型和引用类型
 * (3) 属性如果不赋值会有默认值，规则跟之前一样
 */


public class PropertiesDetail {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("当前这个人的信息：");
        System.out.println("age=" + p1.age + " name=" + p1.name + " sal=" + p1.sal + " isPass=" + p1.isPass);
    }
    
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
}
