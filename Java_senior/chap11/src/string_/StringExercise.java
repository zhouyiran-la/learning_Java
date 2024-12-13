package string_;

/**
 * @author zyr
 * @version 1.0
 */
public class StringExercise {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        StringExercise stringExercise = new StringExercise();
        stringExercise.change(stringExercise.str, stringExercise.ch);
        System.out.println(stringExercise.str + "and ");
        System.out.println(stringExercise.ch);


    }
}
