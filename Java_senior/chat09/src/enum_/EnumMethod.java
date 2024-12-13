package enum_;

/**
 * @author zyr
 * @version 1.0
 */

public class EnumMethod {
    public static void main(String[] args) {
        // 使用Season2
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        // 输出该枚举对象编号:从0开始
        System.out.println(autumn.ordinal());
        // 反编译结果中有values方法，返回Season2[] 返回所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 season: values) {
            System.out.println(season);
        }
        // valueof: 将字符串转换成枚举对象，字符串必须为枚举类中已有常量名
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        // 返回Season2.AUTUMN[2] - Season2.SUMMER[1] = 1 序号相减
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
    }
}
