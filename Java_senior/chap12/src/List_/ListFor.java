package List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zyr
 * @version 1.0
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add("韩顺平");
        System.out.println("list=" + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        for(Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
