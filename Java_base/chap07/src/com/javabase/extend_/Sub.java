package com.javabase.extend_;

public class Sub extends Base{

    public Sub() {
        System.out.println("sub()...");
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
