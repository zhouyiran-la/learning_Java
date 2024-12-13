package static_;

/*
* 1. 类方法中无法使用this和super
* 2. 静态方法只能访问静态成员
* 3. 非静态方法可以访问静态成员和非静态成员
* 4. 静态方法无法被重写
* */

public class StaticMethod {
    public static void main(String[] args) {
        Student tom = new Student("tom");
        Student jim = new Student("jim");
        tom.payFee(300);
        jim.payFee(600);
        Student.showFee();
    }

}

class Student {
     private String name;
     // 定义一个静态变量，来累计学生的学费
     private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Student.fee += fee; // 学费累计
    }
    public static void showFee() {
        System.out.println("总学费有：" + Student.fee);
    }
}