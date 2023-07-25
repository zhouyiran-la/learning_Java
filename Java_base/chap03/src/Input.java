/*
 * 接受用户键盘输入
 * 导入Scanner类所在包
 * 创建Scanner对象
 */
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = myScanner.next();
        System.out.println(name);
        myScanner.close();
    }
}
