package abstract_;

/*模板设计模式*/
public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.caleTimes();
        BB bb = new BB();
        bb.caleTimes();

    }
}

abstract class Template {
    public abstract void job();
    public void caleTimes() {
        long start = System.currentTimeMillis();
        job(); //动态绑定
        long end = System.currentTimeMillis();
        System.out.println("耗时："+ (end - start));
    }
}

class AA extends Template {
    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i <= 100000; i++) {
            num += 1;
        }
    }
}

class BB extends Template {
    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i <= 80000; i++) {
            num += 1;
        }
    }
}
