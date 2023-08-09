// 成员方法传参机制
public class MethodParameter01 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        // AA类--MethodDetail01.java
        AA aa = new AA();
        aa.swap(a, b);

        System.out.println("main方法" + "a=" + a + " b=" + b);// a=10 b=20
    }

}
