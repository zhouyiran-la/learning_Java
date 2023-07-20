//简单展示boolean变量类型使用
//boolean[1] 不可以用0或1代替
public class BooleanDetail {
    public static void main(String[] args) {
        boolean isPass = false;
        if(isPass == true) {
            System.out.println("考试通过");
        } else {
            System.out.println("考试为未通过");
        }
    }
}
