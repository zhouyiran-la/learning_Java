package com.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        Person2[] persons = new Person2[4];
        persons[0] = new Student("jack", '男', 12, "123456");
        persons[1] = new Student("john", '男', 12, "123457");
        persons[2] = new Teacher2("smith", '男', 30, 10);
        persons[3] = new Teacher2("joe", '男', 35, 15);

        HomeWork04 homeWork04 = new HomeWork04();
        homeWork04.bubbleSort(persons);

        System.out.println("---------排序后的数组--------");
        for(int i = 0; i < persons.length; i++) {
            homeWork04.test(persons[i]);
            System.out.println("====================");

        }

    }

    public void bubbleSort(Person2[] persons) {
        Person2 tmp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j+1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }
    }

    public void test(Person2 p) {
        if (p instanceof Student){
            ((Student) p).printInfo();
        } else if (p instanceof Teacher2) {
            ((Teacher2) p).printInfo();
        }
    }


}


class Person2 {
    private String name;
    private char gender;
    private int age;

    public Person2(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String play(){
        return name + "爱玩";
    }

    public String basicInfo() {
        return "姓名：" + name + "\n年龄：" + age + "\n性别：" + gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

class Student extends Person2{
    private String stuId;

    public Student(String name, char gender, int age, String stuId) {
        super(name, gender, age);
        this.stuId = stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void printInfo() {
        System.out.println("学生的信息");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + stuId);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                '}' + super.toString();
    }
}

class Teacher2 extends Person2{
    private int workAge;

    public Teacher2(String name, char gender, int age, int workAge) {
        super(name, gender, age);
        this.workAge = workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void teach() {
        System.out.println("我承诺，我会好好教书");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void printInfo() {
        System.out.println("老师的信息");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + workAge);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher2{" +
                "workAge=" + workAge +
                '}' + super.toString();
    }
}
