/*
 * 张老太养了两只猫：一只叫小白，3岁，白色；另一只叫小花，100岁，花色。
 * 请编写程序，要求：
 * (1) 当用户输入小猫名字时，就显示该猫的名字，年龄，颜色。
 * (2) 如果用户输入小猫名错误，就显示张老太没有这只猫。
 */

public class Object01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

        System.out.println("第一只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color);
        System.out.println("第二只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color);
        
    }
}



class Cat {
    String name;
    int age;
    String color;
}
