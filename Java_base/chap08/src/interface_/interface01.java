package interface_;

public class interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();

        computer.work(phone);


    }
}



class Phone implements USBinterface {
    @Override
    public void start() {
        System.out.println("手机开始工作..");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作..");
    }

    public void call() {
        System.out.println("手机打电话...");
    }

}

class Camera implements USBinterface {
    @Override
    public void start() {
        System.out.println("相机开始工作..");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作..");
    }

}

class Computer {
    public void work(USBinterface usBinterface) {
        usBinterface.start();
        usBinterface.stop();
    }
}