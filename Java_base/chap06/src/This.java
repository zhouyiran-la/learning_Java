public class This {
    public static void main(String[] args) {

        ThisDog dog1 = new ThisDog("大壮", 10);
        dog1.info();
        System.out.println("dog1 hashCode=" + dog1.hashCode());
        ThisDog dog2 = new ThisDog("大黄", 3);
        System.out.println("dog2 hashCode=" + dog2.hashCode());
        dog2.info();
    }
}

class ThisDog {

    String name;
    int age;
    
    // 利用构造器初始化对象
    // public ThisDog(String dName, int dAge) {

    //     name = dName;
    //     age = dAge;
    // }

    // 希望参数名与实际属性名统一, 但这样会使初始化功能失效
    // public ThisDog(String Name, int Age) {

    //     name = Name;
    //     age = Age;
    // }

    // 利用this关键字，this代表当前对象
    public ThisDog(String Name, int Age) {

        this.name = Name;
        this.age = Age;
    }


    public void info() {
        System.out.println(this.name + "\t" + this.age + "\t" + "当前对象的hashCode是" + this.hashCode());
    }
}
