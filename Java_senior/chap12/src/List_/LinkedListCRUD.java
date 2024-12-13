package List_;

import java.util.LinkedList;

/**
 * @author zyr
 * @version 1.0
 */

@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        // 删除第一个元素
        linkedList.remove();
        System.out.println(linkedList);
        // 修改某个结点对象
        linkedList.set(1, 999);
        System.out.println(linkedList);
        // 得到某个结点对象的元素
        Object o = linkedList.get(1);
        System.out.println(o);

        // 三种遍历方式
    }
}
