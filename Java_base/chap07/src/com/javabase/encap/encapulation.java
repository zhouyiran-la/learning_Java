package com.javabase.encap;

/*
创建一个Person类，属性：姓名、年龄、薪水、职位. 要求不能随便查看人的年龄、工资、职位等属性，
并对设置年龄进行合理验证（1-120），姓名长度在2-6之间.
 */
public class encapulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jack666666666");
        person.setAge(30);
        person.setSalary(30000);
        person.setPosition("产品经理");
        System.out.println(person.info());

        Person person1 = new Person("Smith", 2000, 50000, "码农");
        System.out.println(person1.info());

    }

}

class Person {
    public String name;
    private int age;
    private double salary;
    private String position;

    public Person() {
    }

    public Person(String name, int age, double salary, String position) {

//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.position = position;

        // 在构造方法中调用setter
        setName(name);
        setAge(age);
        setSalary(salary);
        setPosition(position);
    }

    // Alt + insert -> getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("姓名长度只能在2-6个字符之间，将设置默认姓名.");
            this.name = "666";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄无效，将设置默认年龄（18岁）.");
            this.age = age;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // 可以增加对当前对象的权限判断
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String info() {
        return "name=" + this.name + " age=" + this.age + " salary=" + this.salary + " position=" + this.position;
    }
}


