import java.util.Scanner;
// 单分支
public class If01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        if(age > 18) {
            System.out.println("你年龄大于18，要对自己的行为负责，送入监狱。");
        }
        myScanner.close();
    }
}
