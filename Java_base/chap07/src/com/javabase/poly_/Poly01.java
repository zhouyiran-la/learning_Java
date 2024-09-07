package com.javabase.poly_;

/**
 * 对象多态
 * 1. 一个对象的编译类型和运行类型可以不一致
 * 2. 编译类型在定义对象时确定不能改变
 * 3. 运行类型可以变化
 * 4. 编译类型=左边 运行类型=右边
 */
public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("小明");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        Cat cat = new Cat("咪咪");
        Fish fish = new Fish("黄花鱼");
        // 多态
        master.feed(dog, bone);
        master.feed(cat, fish);

    }
}
