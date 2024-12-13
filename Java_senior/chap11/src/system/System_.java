package system;

import java.util.Arrays;

/**
 * @author zyr
 * @version 1.0
 */
public class System_ {
    public static void main(String[] args) {
//        System.out.println("ok1");
//        System.exit(0);
//        System.out.println("ok2");
        // 通常目标数组和源数组大小一样
        int[] src = {1, 2, 3};
        int[] dest = new int[3];
        // src: 源数组
        // srcPos: 从源数据的哪个索引位置开始拷贝
        // dest: 目标数组
        // destPos: 拷贝到目标数组的哪个位置
        // length: 数据长度
        System.arraycopy(src, 0, dest, 1, src.length);
        System.out.println(Arrays.toString(dest));
        // 当前时间距离1970-01-01的毫秒数
        System.out.println(System.currentTimeMillis());

    }
}
