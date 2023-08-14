public class This {
    public static void main(String[] args) {

        ThisDog dog = new ThisDog("大壮", 10);
        System.out.println(dog.name + " " + dog.age);
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

    // 利用this关键字

    public ThisDog(String Name, int Age) {

        this.name = Name;
        this.age = Age;
    }


    public void info() {
        System.out.println(name + "\t" + age + "\t");
    }
}
