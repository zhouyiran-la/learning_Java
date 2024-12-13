package map_;

import com.sun.jdi.Value;

import java.io.PrintStream;
import java.util.*;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "111");
        map.put("no2", "222");
        map.put("no1", "333");

        Set set = map.entrySet();
        // class java.util.HashMap$EntrySet
        System.out.println(set.getClass());
        // class java.util.HashMap$Node
        for(Object obj:set) {
            System.out.println(obj.getClass());
        }
        // 获取键
        Set keySet = map.keySet();
        // 获取值
        Collection values = map.values();
        // 按照键删除元素
        map.remove("no1");
        // 按照键获取值
        Object val = map.get("no2");
        // 查找键值是否存在
        System.out.println(map.containsKey("555"));
        // 常用方法使用时查阅文档即可

        // 遍历方式1 -- 用键遍历
        for(Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        // 遍历方式2 -- 直接用值遍历
        for(Object value : values) {
            System.out.println(value);
        }
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object key = iterator2.next();
            System.out.println(key);
        }

        // 遍历方式3 -- entrySet
        for(Object obj:set) {
            Map.Entry m = (Map.Entry) obj;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        Iterator iterator3 = set.iterator();
        while (iterator3.hasNext()) {
            Map.Entry m = (Map.Entry) iterator3.next();
            System.out.println(m.getKey() + "-" + m.getValue());
        }


    }
}
