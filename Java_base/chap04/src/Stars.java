import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        // 经典金字塔
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入层数：");
        int totalLevel = myScanner.nextInt();

        for(int i = 1; i <= totalLevel; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // 进阶金字塔
        for(int i = 1; i <= totalLevel; i++) {
            for(int j = 1; j <= totalLevel - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // 空心金字塔--我的实现
        for(int i = 1; i <= totalLevel - 1; i++) {
            for(int j = 1; j <= totalLevel - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 1; k <= 2 * (i - 1) - 1; k++) {
                System.out.print(" ");
            }
            if(i != 1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int n = 1; n <= 2 * totalLevel - 1; n++) {
                System.out.print("*");
        }

        // 空心金字塔--改进实现
        for(int i = 1; i <= totalLevel; i++) {
            for(int j = 1; j <= totalLevel - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                //每层第一个与最后一个输出“*”
                //最后一层全部输出“*”
                //其余情况输出“ ”
                if(k == 1 || k == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
            }
            System.out.print("\n");
        }
        myScanner.close();

    }
}