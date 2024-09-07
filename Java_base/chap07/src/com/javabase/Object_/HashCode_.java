package com.javabase.Object_;

/**
 * 1. 提高具有哈希结构容器的效率
 * 2. 两个引用指向同一个对象，哈希值一样
 * 3. 两个引用，指向不同对象，哈希值不一样
 * 4. 哈希值是根据地址来的，但不等同于地址
 * 5.
 */
public class HashCode_ {
    public static void main(String[] args) {
        One one = new One();
        One one2 = new One();
        One one3 = new One();
        System.out.println("one:" + one.hashCode());
        System.out.println("one2:" + one2.hashCode());
        System.out.println("one3:" + one3.hashCode());

    }
}

class One {

}

