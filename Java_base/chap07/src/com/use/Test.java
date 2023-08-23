/*
包的三大作用：
- 区分同名类
- 便于管理类
- 控制访问范围

常用包：
java.lang.*：无需导入直接用
java.util.*：工具包
java.net.*：网络开发包
java.awt.*：GUI包
java.io.*：IO流包
 */
package com.use;

import com.xiaoqiang.Dog;
// 同名类无法同时引入
// import com.xiaoming.Dog;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);
        // 用包名区分同名类
        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);

    }
}
