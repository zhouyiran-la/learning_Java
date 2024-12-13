package set_;

import java.util.HashSet;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("rose"));

        hashSet.remove("john");

        System.out.println(hashSet);

        HashSet hashSet2 = new HashSet();

        System.out.println(hashSet2);

        hashSet2.add("lucy");
        hashSet2.add("lucy");
        hashSet2.add(new Dog("tom"));
        hashSet2.add(new Dog("tom"));

        System.out.println(hashSet2);
        // 面试题
        hashSet2.add(new String("hsp"));
        hashSet2.add(new String("hsp"));// 加入不了

        System.out.println(hashSet2);

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
}
