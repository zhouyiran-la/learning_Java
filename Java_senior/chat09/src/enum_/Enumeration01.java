package enum_;

/**
 * @author zyr
 * @version 1.0
 */

/**
 *  枚举是一组常量的集合，里面只包含一组有限特定的对象
 *  自定义类实现美剧
 *  1. 构造器私有化
 *  2. 不提供set方法，因为枚举对象通常为只读
 *  3. 枚举对象使用final + Static实现底层优化
 *
 */
public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
    }
}

class Season {
    private String name;
    private String desc;

    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");

    private Season(String name, String desc) {
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
                ", desc='" + desc;
    }
}
