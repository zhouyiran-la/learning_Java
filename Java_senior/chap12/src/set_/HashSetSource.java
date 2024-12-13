package set_;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);


    }
}
