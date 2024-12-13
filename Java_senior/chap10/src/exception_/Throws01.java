package exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author zyr
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) {
        Throws01 throws01 = new Throws01();
        try {
           throws01.f1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    // throws可以抛出父类异常，也可以抛出异常列表
    public void f1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("aa.txt");
    }
}
