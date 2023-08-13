/*
 * 属性的使用细节
 * (1) 简单介绍访问修饰符：访问修饰符 属性类型 属性名
 *     (public, protected, private, 默认)
 * (2) 属性的定义类型可以为任意类型，包含基本数据类型和引用类型
 * (3) 属性如果不赋值(初始化)会有默认值，规则跟之前一样
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

    public void speak() {
        System.out.println("我是一个好人");
    }

    // cal01成员方法，计算 1 + ... + 1000 的值
    public void cal01() {

        int res = 0;
        for(int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("res=" + res);
        
    }

    // cal02成员方法，加入形参n, 计算 1 + ... + n 的值
    public void cal02(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("res=" + res);
    }

    // getSum成员方法，加入两个形参num1和num2，计算num1和num2的和
    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}
