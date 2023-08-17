/**
 * 创建Employee类，属性(名字, 性别, 年龄, 职位, 薪水)：
 * 1. (名字, 性别, 年龄, 职位, 薪水).
 * 2. (名字, 性别, 年龄)
 * 3. (职位, 薪水)
 */
public class Homework06 {
    public static void main(String[] args) {

    }
}

class Employee {

    String name;
    char gender;
    int age;
    String position;
    double salary;

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String name, char gender, int age, String position, double salary) {
        this(name, gender, age);
        this.position = position;
        this.salary = salary;
    }

}
