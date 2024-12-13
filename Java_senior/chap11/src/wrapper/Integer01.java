package wrapper;

/**
 * @author zyr
 * @version 1.0
 */
/*
* 装箱：基本类型->包装类
* 拆箱：包装类->基本数据类型
* jdk5 以前手都拆箱装箱 jdk5以后自动拆箱装箱
* */

public class Integer01 {
    public static void main(String[] args) {
        // 演示int <--> Integer装箱拆箱
        int n1 = 100;
        // 手动装箱
        Integer integer = new Integer(n1);
        // 看源码
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();
        //自动装箱
        int n2 = 200;
        Integer integer2 = n2;
        // 自动拆箱
        int n3 = integer2;

        // 包转类型-->String
        Integer n4 = 100;
        // 方式1
        String str1 = i + "";
        // 方式2
        String str2 = n4.toString();
        // 方式3
        String str3 = String.valueOf(n4);

        // String-->包装类
        String str4 = "12345";
        // 使用到了自动装箱
        Integer n5 = Integer.parseInt(str4);
        Integer n6 = new Integer(str4);

    }
}
