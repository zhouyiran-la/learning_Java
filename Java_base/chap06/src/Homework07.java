/**
 * (1) 定义Circle类，属性：radius，方法：findArea返回圆的面积
 * (2) 定义PassObject类，方法签名如下：
 * eg. public void printAreas(Circle c, int times)
 * (3) 在printAreas方法中打印输出1-times之间的整数半径值及对应面积：
 * eg. times=5, 输出1, 2, 3, 4, 5以及对应的圆面积.
 * (4) 在main方法中调用printAreas()方法.
 */
public class Homework07 {
    public static void main(String[] args) {

        PassObject obj = new PassObject();
        Circle2 circle2 = new Circle2(3.5);
        obj.printAreas(circle2, 5);
    }
}

class Circle2 {

    double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {

    public void printAreas(Circle2 c, int times) {
        
        System.out.println("Radius\tArea");
        for(int i = 1; i <= times; i++) {
            //修改c对象半径值
            c.setRadius(i);
            System.out.println((double)i + "\t" + c.findArea());
        }
    }
}


