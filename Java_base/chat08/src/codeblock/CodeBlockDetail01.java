package codeblock;

/*
* 1. static代码块也叫静态代码块，对类进行初始化，随类的加载而执行，并且只会执行一次
* 2. 类什么时候被加载：
* 1）创建对象实例时
* 2）创建子类对象实例，父类也会被加载
* 3）使用类的静态成员时（静态属性，静态方法）
* 3. 普通代码块，在创建对象实例时，会被隐式调用，被创建一次，就会调用一次
*    如果只是使用静态成员时，普通代码块并不会被执行
*
*
* */
public class CodeBlockDetail01{
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        System.out.println(Cat.n1);
        Cat cat = new Cat();
        AA aa1 = new AA();
    }
}

class AA {
    static {
        System.out.println("AA 的静态代码块1被执行...");
    }
}

class Animal {
    static {
        System.out.println("Animal 的静态代码块1被执行...");
    }
}

class Cat extends Animal{
    public static int n1 = 999;
    static {
        System.out.println("Cat 的静态代码块1被执行...");
    }
    // 普通代码块
    {
        System.out.println("Cat 的普通代码块1被执行...");
    }
}

class BB extends AA {
    static {
        System.out.println("BB 的静态代码块1被执行...");
    }
}

