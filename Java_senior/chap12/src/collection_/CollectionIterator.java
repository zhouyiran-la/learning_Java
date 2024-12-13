package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author zyr
 * @version 1.0
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            // 向上转型
            Object next = iterator.next();
            System.out.println("obj=" + next);
        }
        // 如果需要再次遍历，需要重置迭代器
        iterator = col.iterator();
        // 增强for遍历(快捷键：I)
        for (Object book:col) {
            System.out.println("book=" + book);
        }


    }


}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
