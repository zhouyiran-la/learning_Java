/*
 * 判断一个数是否为水仙花数？水仙花数指一个三位数，其各个位上数字立方和等于其本身
 * eg. 153 = 1^3 + 5^3 + 3^3
 */
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int num = myScanner.nextInt();
        int tmp1 = num;
        int tmp2;
        int sum = 0;
        while(tmp1 != 0) {
            tmp2 = tmp1 % 10;
            tmp1 /= 10;
            sum += tmp2 * tmp2 *tmp2;
        }
        if(sum == num) {
            System.out.println(num + "是水仙花数");
        } else {
            System.out.println(num + "不是水仙花数");
        }
        myScanner.close();
    }
}
