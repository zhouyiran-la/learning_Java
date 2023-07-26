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
        System.out.println("请输入年龄:");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水：");
        Double sal = myScanner.nextDouble();
        System.out.println("人的信息如下：");
        System.out.println("姓名=" + name + " 年龄=" + age + " 薪水=" + sal);
        myScanner.close();
    }
}
