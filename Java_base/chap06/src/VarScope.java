
/**
 * 作用域（一般针对于变量）
 * (1) 局部变量：通常指在成员方法中定义的变量，严格上来说是除了属性之外的其他变量，作用域为定义它的代码块.
 * (2) 全局变量：作用域为整个类，也称为属性.
 * (3) 全局变量可以不赋值(初始化)直接使用，因为其有默认值。局部变量必须赋值(初始化)才能使用，因为其没有默认值.
 * 
 */
public class VarScope {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}

class Dog {

    int age;// 全局变量

    public void cry() {

        int[] arr = new int[6];
        int n = 10;// 局部变量
        String name = "Jack";// 局部变量
        System.out.println("cry: n=" + n);
        System.out.println("cry: name=" + name);
        System.out.println("cry: age=" + age);

        // 数组作为局部变量有初始值-->凡引用类型的局部变量都有初始值.
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void eat() {

        // System.out.println("eat: n=" + n);
        // System.out.println("eat: name=" + name);
        System.out.println("eat: age=" + age);
    }

}
