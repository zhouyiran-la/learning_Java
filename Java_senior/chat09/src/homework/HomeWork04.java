package homework;

/**
 * @author zyr
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Car car = new Car(26.0);
        car.getAirInstance().flow();

    }
}

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if(temperature > 40) {
                System.out.println("吹冷气");
            } else if (temperature < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("关掉空调");
            }
        }
    }

    public Air getAirInstance() {
        return new Air();
    }

}