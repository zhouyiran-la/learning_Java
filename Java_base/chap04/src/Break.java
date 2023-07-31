/* break语句
 * 1. break语句出现在多层嵌套语句时， 可以用标签指定要终止的是哪一层语句
 * 3. 若不指定标签，默认跳出最近一层
 * 2. 实际开发中尽量避免使用标签
 */
public class Break {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if( i == 3) {
                break;
            }
            System.out.println("i=" + i);
        }

        // 标签的使用
        label1:
        for(int i = 0; i < 10; i++) {
        //label2:
            for(int j = 0; j < 10; j++) {
                 if( i == 3) {
                break label1; // 直接跳出最外层循环
                }
                System.out.println("i=" + i);
            }
           
        }
    }
}
