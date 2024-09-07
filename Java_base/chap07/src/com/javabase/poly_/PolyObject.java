package com.javabase.poly_;
//import com.javabase.poly_.Animal
public class PolyObject {
    public static void main(String[] args) {
        // Animal 编译类型 Dog 运行类型
        Animal animal = new Dog("大黄");
        animal.cry(); //汪汪汪
        // 运行类型变为Cat
        animal = new Cat("小怪");
        animal.cry();
    }
}
