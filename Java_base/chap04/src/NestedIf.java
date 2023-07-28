import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Double score;
        char gender;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入初赛成绩：");
        score = myScanner.nextDouble();
        System.out.println("请输入性别：");
        gender = myScanner.next().charAt(0);
        
        if(score > 8.0) {
            if(gender == '男') {
                System.out.println("恭喜进入男子组决赛！");
            } else if(gender == '女') {
                System.out.println("恭喜进入女子组决赛！");
            } else {
                System.out.println("性别无效！");
            }
        } else {
            System.out.println("抱歉，您未进入决赛。");
        }
        myScanner.close();
    }
}
