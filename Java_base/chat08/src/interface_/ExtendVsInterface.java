package interface_;

/*
* 1. 继承主要解决代码的复用性和可维护性 接口主要价值在于设计
* 2. 接口比继承更加灵活
* 3. 接口在一定程度上实现代码解耦
* */

public class ExtendVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();
        wukong.flying();
        wukong.swimming();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println("爬树...");
    }
}

class LittleMonkey extends Monkey implements Birdable, Fishable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void flying() {
        System.out.println("飞翔...");

    }

    @Override
    public void swimming() {
        System.out.println("游泳...");
    }
}

interface Birdable {
    void flying();

}

interface Fishable {
    void swimming();
}
