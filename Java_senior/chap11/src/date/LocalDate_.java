package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zyr
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        // 获取当前日期时间的对象
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        System.out.println(ldt);
        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String formatDate = dtf.format(ldt);
        System.out.println(formatDate);

        LocalDateTime ldt2 = ldt.plusDays(890);
        String formatDate2= dtf.format(ldt2);
        System.out.println(formatDate2);

        LocalDateTime ldt3 = ldt.minusMinutes(3456);
        String formatDate3= dtf.format(ldt3);
        System.out.println(formatDate3);
    }
}
