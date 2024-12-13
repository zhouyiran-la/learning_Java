package enum_;

/**
 * @author zyr
 * @version 1.0
 */

/**
 *  1. 使用enum关键字时会默认继承一个Enum类，这个类是一个final类
 *  2. public final static Season SPRING = new Season("春天", "温暖");
 *  等价于SPRING("春天", "温暖")
 *  3. 如果有多个常量对象，使用，间隔即可
 *  4. 需将常量定义置顶
 *  5. 无参构造器创建常量对象实参列表和小括号都可以省略eg. what
 *  6. 使用enum关键字之后不能再继承其他类，但仍旧可以实现接口
 */
public class Enumeration02 {
    public static void main(String[] args) {
        Season2 season2 = Season2.AUTUMN;
        System.out.println(season2);
    }
}

enum Season2 {


//    public final static Season SPRING = new Season("春天", "温暖");
//    public final static Season SUMMER = new Season("夏天", "炎热");
//    public final static Season AUTUMN = new Season("秋天", "凉爽");
//    public final static Season WINTER = new Season("冬天", "寒冷");

    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷"),
    What;
    private String name;
    private String desc;

    private Season2() {

    }

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + "}";
    }
}