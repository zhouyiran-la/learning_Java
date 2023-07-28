/*
 * switch细节
 * 1. 表达式数据类型应和case后常量保持一致（或者可以自动转换和相互比较）
 * 2. 表达式返回值数据类型必须为（byte, short, int, char, enum, String）
 * 3. case子句中的值必须是常量，而不能是变量
 * 4. default子句是可选的
 * 5. 注意使用break语句
 */

public class SwitchDetail {
    public static void main(String[] args) {

        // double b = 1.1;
        // switch(b) { // 错误，b为double类型
        //     case 1.1:
        //         System.out.println("ok1");
        //         break;
        //     case 2.1:
        //         System.out.println("ok2");
        //         break;    
        // }
    }
}
