// 求出六只鸡的平均体重
public class Array01 {
    public static void main(String[] args) {

        double[] hens = {3, 5, 1, 3.4, 2, 50};
        double totalWeight = 0;

        // 获取数组长度
        System.out.println("数组的长度=" + hens.length);
        for(int i = 0; i < hens.length; i++) {
            System.out.println("第" + (i+1) + "个元素的值" + hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("总体重=" + totalWeight + "平均体重=" + (totalWeight / 6) );
    }
}
