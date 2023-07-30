import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args) {
        
        double score;
        double avgEachClass;
        double avgAllClass;
        double sumEachClass = 0d;
        double sumAllClass = 0d;
        int passNum = 0;
        int classNum = 3;
        int StuNum = 5;
        Scanner myScanner = new Scanner(System.in);

        for(int i = 1; i <= classNum; i++) {
            System.out.println("请输入" + i + "班成绩：");
            for(int j = 1; j <= StuNum; j++) {
                score = myScanner.nextDouble();
                if(score >= 60) {
                    passNum++;
                }
                sumEachClass += score;
            }
            sumAllClass += sumEachClass;
            avgEachClass = sumEachClass / 5;
            System.out.println(i + "班总成绩为：" + sumEachClass + "，平均成绩为：" + avgEachClass );
            sumEachClass = 0;
        }

        avgAllClass = sumAllClass / 15;
        System.out.println( "三个班总成绩为：" + sumAllClass + "，平均成绩为：" + avgAllClass + "，及格人数为" + passNum + "人");
        myScanner.close();
    }
}
