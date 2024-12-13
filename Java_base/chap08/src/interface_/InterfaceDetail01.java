package interface_;
/*
* 1. 接口不能实例化
* 2. 接口中所有方法是public方法，接口中的抽象方法可以不用abstract修饰
* 3. 一个普通类实现接口，必须将接口中所有方法都实现
* 4. 抽象类实现接口，可以不用实现接口的方法
*
* */
public class InterfaceDetail01 {
}


interface IA {
    void say();
    void  hi();
}

class Cat implements IA {// alt + enter

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA {// alt + enter

    @Override
    public void say() {

    }

}