package string_;

/**
 * @author zyr
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String str = "abcdef";
        String strChanged = HomeWork01.reverse(str, 1, 4);
        System.out.println(strChanged);
    }
    public static String reverse(String str, int start, int end) {
        if (start < 0 || end >= str.length() || start > end || str == null) {
            return "";
        }
        char[] chars = str.toCharArray();
        int mid = Math.round((float) (start + end) / 2);
        char temp;
        for (int i = start; i < mid; i++) {
            temp = chars[i];
            chars[i] = chars[end + start - i];
            chars[end + start - i]  = temp;
        }
        return new String(chars);
    }

    public static String reverse2(String str, int start, int end) {
        if (start < 0 || end >= str.length() || start > end || str == null) {
            return "";
        }
        char[] chars = str.toCharArray();
        char temp;
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
