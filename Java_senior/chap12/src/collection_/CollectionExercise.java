package collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zyr
 * @version 1.0
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黑", 3));
        list.add(new Dog("小红", 2));
        list.add(new Dog("大黄", 5));

        for (Object dog: list) {
            System.out.println("dog=" + dog);
        }

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);
        }

    }
}

@SuppressWarnings({"all"})
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
