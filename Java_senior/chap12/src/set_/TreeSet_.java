package set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 调用字符串比较
//                return ((String) o1).compareTo((String) o2);
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        // 若按照字符串长度排序，则abc无法加入
        treeSet.add("abc");
        System.out.println(treeSet);
    }
}
