package map_;

import java.util.Comparator;
import java.util.TreeMap;


/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 按照key排序
//                return ((String) o1).compareTo((String) o2);
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeMap.put("no1", "jack");
        treeMap.put("no2", "tom");
        treeMap.put("no3", "sp");
        treeMap.put("no4", "a");
        // 若按照字符串长度排序，则abc无法加入
        treeMap.put("no5", "abc");
        System.out.println(treeMap);
    }
}
