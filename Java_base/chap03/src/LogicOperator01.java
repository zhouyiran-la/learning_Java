/*
 * 逻辑运算符的使用
 * && 和 & 
 * &&短路与：如果第一个条件为false，其余条件不会判断，最终结果为false
 * & 逻辑与：所有关系表达式都会判断
 */
public class LogicOperator01 {
    public static void main(String[] args) {
          int age = 50;
          if(age > 20 && age < 90) {
            System.out.println("ok100");
          }
          if(age > 20 & age < 90) {
            System.out.println("ok200");
          }

          // & 和 && 区别
          int a = 4;
          int b = 9;
          if(a < 1 && ++b < 50 ) {
            System.out.println("ok300");
          }
          System.out.println("a=" + a + "b="+ b);

          int c = 4;
          int d = 9;
          if(a < 1 & ++b < 50) {
            System.out.println("ok400");
          }
          System.out.println("c=" + c + "d=" + d);
    } 
}
