import java.util.Scanner;
// 多分支
public class If03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入信用分");
        int score = myScanner.nextInt();
        if(score >= 1 && score <= 100) {
        
            if(score == 100) {
                System.out.println("信用极好");
            } else if(score > 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if(score >= 60 && score <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
            myScanner.close();
        } else {
            System.out.println("信用分范围为1-100，请重新输入:)");
        }
    }
}
