package com.javabase.extend_;

/*
继承使用细节
- 子类继承父类所有属性和方法，但私有属性和方法无法直接访问，需要通过公共的方法.
- 创建子类对象时(不论使用哪个构造器)必须调用父类构造器，默认情况下调用父类无参构造器. 若父类不提供无参构造器，必须在子类构造器
中利用super关键字显示指定构造器完成父类初始化，否则编译不通过.
 */
public class ExtendsDetail {
    public static void main(String[] args) {

        // 注意观察子类与父类构造器调用情况
        Sub sub1 = new Sub();
        Sub sub2 = new Sub("lala");

        // sub1.sayOk();
    }
}
