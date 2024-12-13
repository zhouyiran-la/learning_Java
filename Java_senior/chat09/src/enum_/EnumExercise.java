package enum_;

/**
 * @author zyr
 * @version 1.0
 */
public class EnumExercise {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        // 调用父类toString
        System.out.println(boy);
        System.out.println(boy2 == boy);
    }
}

enum Gender{
    BOY,GIRL;
}