package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyr
 * @version 1.0
 */
public class CollectionMethed {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new ArrayList();
        // 添加元素
        list.add("jack");
        // 会有自动装箱过程
        list.add(10);
        list.add(true);
        System.out.println("list=" + list);
        list.remove(0);
        System.out.println("list=" + list);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        // 是否为空
        System.out.println(list.isEmpty());
        // 清空
//        list.clear();
        list2.add("红楼梦");
        list2.add("三国演义");
        // 添加多个元素
        list.addAll(list2);
        System.out.println("list=" + list);
        list.add("聊斋志异");
        // 清空多个元素
        list.removeAll(list2);
    }
}
