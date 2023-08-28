package com.javabase.extend_;

public class Sub extends Base{
    public Sub() {
        // 隐藏语句: 默认调用父类无参构造器（如果有的话）
        // super();

        super("Jack", 20);
        // super与this不能共存
        // this(“zhouyiran”);
        System.out.println("Sub()...");
    }

    public Sub(String name) {
        super("Jack", 20);
        System.out.println("Sub(String name)...");
    }

    public void sayOk() {
        System.out.println("sayOk()...");
        System.out.println("n1=" + n1 + " " + "n2=" + n2 + " " + "n3=" + n3);
        // 通过父类公共方法访问私有属性
        System.out.println("n4=" + getN4());
        test100();
        test200();
        test300();
        // 私有父类方法无法访问
        callTest400();
        // test400();
        System.out.println("sayOk()...end...");
    }
}
