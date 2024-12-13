package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author zyr
 * @version 1.0
 */

@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        // set接口对象不能存放重复元素，null可以加入
        set.add(null);

        // 方式1：使用迭代器
        System.out.println("=========迭代器=========");
        System.out.println("set=" + set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        // 方式2：使用增强for
        System.out.println("=========增强for=========");
        for(Object o : set) {
            System.out.println("o=" + o);
        }



    }
}
