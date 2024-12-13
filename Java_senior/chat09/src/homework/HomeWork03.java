package homework;

import java.beans.Visibility;

/**
 * @author zyr
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
      Person Tang = new Person("唐僧", new Hourse());
      Tang.passRiver();
      Tang.common();
      Tang.passFireMountain();
    }
}

// 实际开发中接口和类都要单独一个文件
interface  Vehicles {
    void work();
}

class Hourse implements Vehicles {

    @Override
    public void work() {
        System.out.println("骑马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("坐船");
    }
}

class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("坐飞机");
    }
}

class VehiclesFactory {
    // 饿汉式
    private static Hourse hourse = new Hourse();
    private VehiclesFactory() {}
    // 马始终是同一匹
    public static Hourse getHouse() {
        return hourse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }

}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {

        if( !(this.vehicles instanceof Boat)) {
            // 获得船
            Boat boat = VehiclesFactory.getBoat();
            boat.work();
        }

    }

    public void common() {

        if(!(this.vehicles instanceof Hourse)) {
            vehicles = VehiclesFactory.getHouse();
        }
        // 使用接口对象调用
        vehicles.work();
    }

    public void passFireMountain() {
        if(!(this.vehicles instanceof Plane)) {
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }


}