package set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓",1000));
        linkedHashSet.add(new Car("奥迪",10000));
        linkedHashSet.add(new Car("奥拓",1000));

        System.out.println(linkedHashSet);

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Car)) return false;
        Car car = (Car) object;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
