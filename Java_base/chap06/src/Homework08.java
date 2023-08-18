import java.util.Random;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        /*
         * guessingDetail是二维数组，记录游戏结果.
         * 第一维代表局数
         * 第二维分别记录玩家出拳、电脑出拳、输赢情况
         */
        int[][] guessingDetail = new int[3][3];
        Scanner myScanner = new Scanner(System.in);
        Tom tom = new Tom();
        int j = 0; 

        System.out.println("**********************");
        System.out.println("猜拳游戏（共三局）");
        System.out.println("**********************");
        for(int i = 0; i < 3; i++) {

            System.out.println("请出拳：0-石头，1-剪刀，2-步");
            int num = myScanner.nextInt();
            tom.setTomGuessing(num);

            guessingDetail[i][j+2] = tom.tomVsComputor();
            guessingDetail[i][j] = tom.tomGuessing;
            guessingDetail[i][j+1] = tom.computerGuessing;

            System.out.println("================================================");
            System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
            if(guessingDetail[i][j+2] > 0) {
                System.out.println((i+1) + "\t" + guessingDetail[i][j] + "\t\t" + guessingDetail[i][j+1] + "\t\t" + "玩家赢");
            } else if(guessingDetail[i][j+2] > 0) {
                System.out.println((i+1) + "\t" + guessingDetail[i][j] + "\t\t" + guessingDetail[i][j+1] + "\t\t" + "玩家输");
            } else {
                System.out.println((i+1) + "\t" + guessingDetail[i][j] + "\t\t0" + guessingDetail[i][j+1] + "\t\t" + "平局");
            }
            System.out.println("================================================");

        }

        System.out.println("游戏结束！你共赢了" + tom.tomWincount + "次。");

        myScanner.close();
    }
    
}


class Tom {

    int tomGuessing; // Tom出拳
    int computerGuessing; // 电脑出拳
    int tomWincount = 0; // Tom赢的次数

    public void setTomGuessing(int tomGuessing) {
        this.tomGuessing = tomGuessing;
    }

    public void setComputorGuessing(){
        Random r = new Random();
        // 获得0-2之间随机数
        this.computerGuessing = r.nextInt(3);
    }

    /**
     * 比较猜拳结果
     * @return 玩家赢返回1；电脑赢返回-1；平局返回0.
     */
    public int tomVsComputor() {

        this.setComputorGuessing();
        if(this.tomGuessing == 0 && this.computerGuessing == 1) {
            this.tomWincount++;
            return 1;
        } else if(this.tomGuessing == 0 && this.computerGuessing == 2) {
            return -1;
        } else if(this.tomGuessing == 1 && this.computerGuessing == 0) {
            return -1;
        } else if(this.tomGuessing == 1 && this.computerGuessing == 2) {
            this.tomWincount++;
            return 1;
        } else if(this.tomGuessing == 2 && this.computerGuessing == 0) {
            this.tomWincount++;
            return 1;
        } else if(this.tomGuessing == 2 && this.computerGuessing == 1) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
