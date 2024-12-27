package collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        // 顺序颠倒
        Collections.reverse(list);
        // 随机排序
        Collections.shuffle(list);
        // 自然排序
        Collections.sort(list);
        // 指定排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        // 交换指定位置
        Collections.swap(list, 0, 1);

        Collections.max(list);

        Collections.frequency(list, "111");

        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, list);
        Collections.replaceAll(list, "222", "888");

    }
}
