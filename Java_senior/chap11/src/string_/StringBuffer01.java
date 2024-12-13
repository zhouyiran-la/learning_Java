package string_;

/**
 * @author zyr
 * @version 1.0
 */
// 保存字符串变量 里面的值可以更改 不会每次更新地址（容量不够的时候更新）
public class StringBuffer01 {
    public static void main(String[] args) {

        // 1. StringBuffer的直接父类是AbstactStringBuilder
        // 2. StringBuffer实现了Serializable接口，可是串行化
        // 3. 在父类中AbstactStringBuilder有属性char[] value.不是final类型，因此存放在堆中
        // 4. StringBuffer是一个final类，不能被继承
        // 大小为len(hello) + 16
        StringBuffer stringBuffer = new StringBuffer("hello");
        // 创建一个大小为16的空字符数组
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer(100);
        // String --> StringBuffer
        String str = "hello tom";
        StringBuffer stringBuffer3 = new StringBuffer(str);

        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer.append(str);

        // StringBuffer --> String
        String str1 =  stringBuffer.toString();
        String str2 = new String(stringBuffer);


    }
}
