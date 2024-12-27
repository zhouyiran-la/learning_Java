package generic;

/**
 * @author zyr
 * @version 1.0
 */
public class CustomInterfaceGerneric {
    public static void main(String[] args) {

    }
}



interface  IUsb<U, R> {
    int n = 10;
//    U name; 不合法接口中属性为 final static 无法使用泛型
    R get (U u);

    void hi(R r);
    void run(R r1, R r2, U u1, U u2);
    // 默认方法（有方法体提供默认上实现）
    default R method (U u) {
        return null;
    }
}

// 在继承接口中指定泛型类型

interface IA extends IUsb<String, Double> {

}

class AA implements IA {
    @Override
    public Double get(String string) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }

    @Override
    public Double method(String string) {
        return IA.super.method(string);
    }
}
// 在实现接口时指定泛型类型
class BB implements IUsb<Integer, Float> {
    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }

    @Override
    public Float method(Integer integer) {
        return IUsb.super.method(integer);
    }
}

