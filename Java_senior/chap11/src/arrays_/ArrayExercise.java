package arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zyr
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100.00);
        books[1] = new Book("金瓶梅", 90.00);
        books[2] = new Book("青年文摘", 5.00);
        books[3] = new Book("Java从入门到放弃", 100.00);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                if(priceVal > 0) {
                    return -1;
                } else if(priceVal < 0){
                    return 1;
                } else {
                    return 0;
                }

            }
        });

        System.out.println(Arrays.toString(books));
    }




}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
