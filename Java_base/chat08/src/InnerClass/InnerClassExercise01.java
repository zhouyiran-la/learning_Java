package InnerClass;

// 匿名内部类直接作为实参
public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("匿名内部类实现show方法");
            }
        });
    }

    public static void f1(AA aa) {
        aa.show();
    }
}

interface AA {
    void show();
}
