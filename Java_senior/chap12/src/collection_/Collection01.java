package collection_;

import java.util.*;

/**
 * @author zyr
 * @version 1.0
 */
public class Collection01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println("list=" + list);
        System.out.println(list.get(3));

    }
}


