import java.util.Scanner;
// 双分支
public class If02 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        if(age > 18) {
            System.out.println("你的年龄大于18， 要对自己的行为负责， 送入监狱。");
        } else {
            System.out.println("你的年龄不大这次放过你了。");
        }
        myScanner.close();
    }
}
