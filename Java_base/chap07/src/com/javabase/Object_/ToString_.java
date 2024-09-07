package com.javabase.Object_;

/**
 * 1. 默认返回：全类名（包名+类名）@哈希值的十六进制
 * 2. 往往重写该方法
 * 3. 打印对象或拼接对象时，都会自动调用该对象的toString形式
 */
public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString() + "hashcode=" + "monster");
        System.out.println(monster);

    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    // 重写toString方法

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
