import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符:");
        char input = myScanner.next().charAt(0);

        switch(input) {
            case 'a':
                System.out.println("今天是星期一");
                break;
            case 'b':
                System.out.println("今天是星期二");
                break;
            case 'c':
                System.out.println("今天是星期三");
                break;
            case 'd':
                System.out.println("今天是星期四");
                break;
            case 'e':
                System.out.println("今天是星期五");
                break;
            case 'f':
                System.out.println("今天是星期六");
                break;
            case 'g':
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("无匹配字符");
        }
        myScanner.close();
    }
    
}
