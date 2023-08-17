/**
 * 定义Circle类，定义属性半径，提供显示圆周长、面积的方法.
 */
public class Homework04 {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        circle.getPerimeter();
        circle.getArea();
    }
}

class Circle{

    double radius;
    public Circle(double radius) {
        this.radius = radius;
    } 

    public void getPerimeter() {
        System.out.println("周长=" + 2 * Math.PI * this.radius);
    }

    public void getArea() {
        System.out.println("面积=" + Math.PI * this.radius * this.radius);
    }    
}