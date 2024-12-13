package List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyr
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add("韩顺平");
        System.out.println("list=" + list);

        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");

        list.addAll(1, list2);
        System.out.println("list=" + list);
        list.add("韩顺平");
        System.out.println(list.indexOf("tom"));
        System.out.println(list.lastIndexOf("韩顺平"));
        list.remove(0);
        System.out.println("list=" + list);
        list.set(1, "玛丽");
        System.out.println("list=" + list);
        // 范围为前闭后开
        List reslist = list.subList(0, 2);
        System.out.println("relist=" + reslist);
    }
}
