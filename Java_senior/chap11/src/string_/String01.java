package string_;

/**
 * @author zyr
 * @version 1.0
 */
/*
* 1. String是final类，不能被其他类继承
* 2. String有属性private final char[] value 用于存放字符串属性
* 3. value是final类型 地址不可以修改 单个字符内容可以改变
* */
public class String01 {
    public static void main(String[] args) {
        // 字符串常量
        String name = "Hello,jack. My name is zhou yiran";
        String str = new String("hhhhh");
        final char[] value = {'a', 'b', 'c'};
        char[] v2 = {'t', 'o', 'm'};
        value[0] = 'H';
        name = "hahaha";
//        value = name;
    }
}
