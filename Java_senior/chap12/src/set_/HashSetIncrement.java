package set_;

import java.util.HashSet;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for(int i = 1; i <=100; i++) {
            hashSet.add(i);
        }

        for(int i = 1; i <= 12; i++) {
            hashSet.add(new A(i));
        }

    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }
    // hashcode指定为固定值，该类实例添加hashset时会在同一链表上
    @Override
    public int hashCode() {
        return 10;
    }
}
