// 成员方法快速入门
public class Method01 {

    public static void main(String[] args) {

        // Person类之前定义过，见PropertiesDetail.java
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(5);
        p1.cal02(50);
        int returnRes = p1.getSum(10, 20);
        System.out.println("returnRes=" + returnRes);
    }
    
}

