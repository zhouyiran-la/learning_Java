/**
 * 有三个方法：
 * (1) 返回姓名和两门课成绩（总分）
 * (2) 返回姓名和三门课成绩（总分）
 * (3) 返回姓名和五门课成绩（总分）
 * 
 */
public class VarParameterExercise {
    public static void main(String[] args) {

        VarParameterMethod obj = new VarParameterMethod();
        String res = obj.showScore("周依然", 85, 95, 80);
        System.out.println(res);

    }
}
