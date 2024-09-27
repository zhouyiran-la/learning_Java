package interface_;

/*
* 5. 一个类同时可以实现多个接口
* 6. 接口中的属性修饰符为public static final，必须进行初始化
* 7. 接口中属性访问形式: 接口名.属性
* 8. 一个接口不能继承其他的类，但可以继承多个别的接口
* 9. 接口的修饰符只能时public和默认（同类一样）
* */
public class InterfaceDetail02 {
}


interface IB {
    int n1 = 10; // 等价于 public static final int = 1;
    void hi();
}

interface IC {

    void say();
}


class Pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
