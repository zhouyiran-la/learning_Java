/*
 * 输出1-100之间不能被5整除的数，每五个一行
 */
public class Homework03 {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 5 != 0) {
                System.out.print(i + "\t");
                count++;
            }
            if(count == 5) {
                System.out.print('\n');
                count = 0;
            }
        }
    }
}
