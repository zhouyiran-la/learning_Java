package date;

import java.time.Instant;
import java.util.Date;

/**
 * @author zyr
 * @version 1.0
 */
public class Instant01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        // Instant --> Date
        Date date = Date.from(now);
        // Date --> Instant
        Instant instant = date.toInstant();

    }
}
