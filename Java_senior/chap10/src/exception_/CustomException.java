package exception_;

/**
 * @author zyr
 * @version 1.0
 */

// 一般继承RuntimeException 表示运行时异常
public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        if(!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
