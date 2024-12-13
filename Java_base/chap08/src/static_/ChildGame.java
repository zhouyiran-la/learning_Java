package static_;

import java.sql.SQLOutput;

/*
1.static变量在类加载的时候就生成了
2.static变量保存在class实例的尾部，存储在堆中（JDK7以上）或者方法区（根据JDK版本不同有所变化）
* */

// p374
public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("白骨精");
        child1.join();
        Child.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        Child.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        Child.count++;
        // 所有对象共享类变量
        System.out.println("child1.count=" + child1.count);
        System.out.println("child2.count=" + child2.count);
        System.out.println("child3.count=" + child3.count);

    }

}

class Child {
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏...");
    }
}
