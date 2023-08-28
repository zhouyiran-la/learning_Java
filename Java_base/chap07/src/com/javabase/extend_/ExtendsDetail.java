package com.javabase.extend_;

/*
继承使用细节：
- 涉及文件：ExtendsDetail.java、Base.java、Sub.java、TopBase.java
- 子类继承父类所有属性和方法，但私有属性和方法无法直接访问，需要通过公共的方法.
- 创建子类对象时(不论使用哪个构造器)必须调用父类构造器，默认情况下调用父类无参构造器. 若父类不提供无参构造器，必须在子类构造器
中利用super关键字显示指定父类构造器完成父类初始化，否则编译不通过.
- super在使用时必须放在构造器第一行
- super()和this()都只能放在构造器第一行，故不能同时出现在同一个构造器中.
- Java中Object是所有类的基类
- 父类构造器调用不限于直接父类，将一直向上追溯至Object类(顶级父类).
- 子类只能继承一个父类，Java中是单继承制.

 */
public class ExtendsDetail {
    public static void main(String[] args) {

        // 注意观察子类与父类构造器调用情况
        Sub sub1 = new Sub();
        System.out.println("==================");
        Sub sub2 = new Sub("lala");

        // sub1.sayOk();
    }
}
