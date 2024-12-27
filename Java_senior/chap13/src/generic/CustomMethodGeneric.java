package generic;

/**
 * @author zyr
 * @version 1.0
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        // 直接传入参数，编译器自动判断
        car.fly("宝马",100);

        Fish<Integer> fish = new Fish<>();
        fish.hello(10, 5.2f);

    }
}
// 定义在普通类中
class Car {
    public void run () {}

    public <T, R> void fly(T t, R r) {

    }
}
// 定义在泛型类中
class Fish<T> {
    public void run() {

    }

    public<U, M> void eat(U u, M m) {

    }
    
    public<K> void hello(T t, K v) {
        
    }
}