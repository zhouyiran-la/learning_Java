package interface_;

/*
* 1. 接口引用可以指向实现了接口的类对象
* */

public class InterfacePoly {
    public static void main(String[] args) {
        // 接口引用可以指向实现了接口的类对象
        IF if01 = new Monster();
        if01 = new Car();
        // 接口多态数组
        USBinterface[] USBinterfaces = new USBinterface[2];
        USBinterfaces[0] = new Phone();
        USBinterfaces[1] = new Camera();
        for (int i = 0; i < USBinterfaces.length; i++) {
            USBinterfaces[i].start();
            // 若运行类型是Phone
            if (USBinterfaces[i] instanceof Phone) {
                ((Phone) USBinterfaces[i]).call();
            }
        }
        // 多态传递 Monster没有直接实现IG接口，但是由于IF接口继承自IG接口，所以可以直接作为引用
        IG ig01 = new Monster();



    }
}

interface IF extends IG{

}

interface IG  {

}

class Monster implements IF {

}

class Car implements  IF {

}

