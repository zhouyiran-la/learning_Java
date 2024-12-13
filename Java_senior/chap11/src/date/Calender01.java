package date;

import java.util.Calendar;

/**
 * @author zyr
 * @version 1.0
 */

/*
 *  Calender是二代抽象类
 *  1. 是构想类，并且构造器是private
 *  2. 通过getInstance()来获取实例
 *  3. 没有提供格式化工具，需要自己组合
 */


public class Calender01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("年" + c.get(Calendar.YEAR));
        // 月从0开始
        System.out.println("月" + c.get(Calendar.MONTH) + 1);
    }
}
