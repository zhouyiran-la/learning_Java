package set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("milan", 18));
        hashSet.add(new Employee("simith", 28));
        hashSet.add(new Employee("milan", 18));
        System.out.println("hashSet=" + hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Employee)) return false;
        Employee employee = (Employee) object;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
