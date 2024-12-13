package BigInteger_;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author zyr
 * @version 1.0
 */
// 高精度小数
public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.5658988888888888888555");
        BigDecimal bigDecimal1 = new BigDecimal("100");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        // 如果结果是无线小数，会抛出异常，通常需要指定精度
        System.out.println(bigDecimal.divide(bigDecimal1, RoundingMode.CEILING));

    }
}
