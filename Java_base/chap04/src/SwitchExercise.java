import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入小写字母：");
        char ch = myScanner.next().charAt(0);

        //01
        switch(ch) {
            case 'a':
                System.out.println((char)('a' - 32));
                break;
            case 'b':
                System.out.println((char)('b' - 32));
                break;
            case 'c':
                System.out.println((char)('c' - 32));
                break;
            case 'd':
                System.out.println((char)('d' - 32));
                break;
            case 'e':
                System.out.println((char)('e' - 32));
                break;
            default:
                System.out.println("other");
        }

        //02
        double score = myScanner.nextDouble();
        if(score >=0 && score <= 100) {
            switch((int)(score / 60)) {
                case 0:
                    System.out.println("成绩不合格");
                    break;
                case 1:
                    System.out.println("成绩合格");
                    break;
            }
        } else {
            System.out.println("输入有误");
        }
        myScanner.close();

        //03
        int season = 6;
        switch(season) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误");
        }



    }
}
