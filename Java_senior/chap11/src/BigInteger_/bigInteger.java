package BigInteger_;

import java.math.BigInteger;

/**
 * @author zyr
 * @version 1.0
 */
public class bigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("2378888888888999999999999999999");
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger("100");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger substract = bigInteger.subtract(bigInteger1);
        System.out.println(substract);
    }
}
