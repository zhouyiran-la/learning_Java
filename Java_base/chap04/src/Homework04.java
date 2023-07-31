// 输出小写a-z以及大写的Z-A

public class Homework04 {
    public static void main(String[] args) {
        int aASCII = 97;
        int ZASCII = 65 + 25;
        
        // 我的实现
        for(int i = aASCII; i <= aASCII + 25; i++) {
            System.out.print((char)i + " ");
        }

        System.out.print('\n');

        for(int j = ZASCII; j >= ZASCII - 25; j--) {
            System.out.print((char)j + " ");
        }

        System.out.print('\n');
        
        // 改进实现
        for(char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        System.out.print('\n');

        for(char j = 'Z'; j >= 'A'; j--) {
            System.out.print(j + " ");
        }
    }
}
