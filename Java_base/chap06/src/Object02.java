public class Object02 {
    public static void main(String[] args) {

        Car car = new Car();
        car.name = "Jeep";
        car.price = 100000000000.0;
        car.color = "black";
        car.master = new String[1];
        car.master[0] = "zhouyiran";
        System.out.println("name=" + car.name + " price=" + car.price + " color=" + car.color + 
                                                " master=" + car.master[0]);

    }
    
}

class Car {
    // 属性可以是基本数据类型或者引用类型
    String name;
    double price;
    String color;
    String[] master;
}