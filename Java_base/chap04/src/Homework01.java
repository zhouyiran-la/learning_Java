/*
 某人有100,000元，每经过一次路口，需要缴费，规则如下：
 1）当现金>50000时，每次交5%
 2）当现金<=50000时，每次交1000
 编程计算该人可以经过多少次路口？
 */
public class Homework01 {
    public static void main(String[] args) {
        //double totalMoney = 100000d;
        double currentMoney = 100000d;
        int count = 0;

        while(true) {
            if(currentMoney > 50000) {
                currentMoney = 0.95 * currentMoney;
                count++;
            } else if(currentMoney >= 1000 && currentMoney <=50000) {
                currentMoney -= 1000;
                count++;
            } else {
                System.out.println("余额不足！");
                break;
            }        
        }
        System.out.println("可以经过" + count + "次路口");
    }
}
