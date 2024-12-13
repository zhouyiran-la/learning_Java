package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// 不要引入这个包
//import java.sql.Date;
/**
 * @author zyr
 * @version 1.0
 */
// 第一代日期类
public class Date01 {
    public static void main(String[] args) throws ParseException {
        // 获取当前系统时间
        Date d1 = new Date();
        System.out.println(d1);
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String formatDate = sdf.format(d1);
        System.out.println(formatDate);
        // 毫秒数转化成日期
        Date d2 = new Date(9234567);
        System.out.println(d2);

        // 字符串转换成Date格式
        String str = "1996年01月01日 10:20:30 星期一";
        // 必须处理异常
        Date d3 = sdf.parse(str);
        System.out.println(d3);
    }
}
