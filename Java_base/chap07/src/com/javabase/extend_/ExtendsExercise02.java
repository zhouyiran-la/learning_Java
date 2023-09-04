package com.javabase.extend_;

// 说出以下代码的输出结果
// 我是AA类
// 我是BB类有参构造器
// 我是CC类的有参构造
// 我是CC类的有参构造

public class ExtendsExercise02 {
    public static void main(String[] args) {
        CC c = new CC();
    }
}

class AA {
    public AA() {
        System.out.println("我是AA类");
    }
}

class BB extends AA {
    public BB() {
        System.out.println("我是BB类的无参构造");
    }

    public BB(String name) {
        System.out.println("我是BB类的有参构造");
    }
}

class CC extends BB {
    public CC() {
        this("hello");
        System.out.println("我是CC类的无参构造");
    }

    public CC(String name) {
        super("hahah");
        System.out.println("我是CC类的有参构造");
    }
}
