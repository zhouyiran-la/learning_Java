package List_;

import java.util.ArrayList;

/**
 * @author zyr
 * @version 1.0
 */
public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for(int i = 11; i <= 15; i++) {
            list.add(i);
        }
    }

}
