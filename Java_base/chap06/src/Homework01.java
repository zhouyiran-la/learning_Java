public class Homework01 {

    public static void main(String[] args) {

        Homework01A obj = new Homework01A();
        double[] arr = {5.6, 89.6, 78.5, 65.8, 89.4};
        String[] str = {"nihao","hi~", "hello", "chao~"};
        Double res = obj.max(arr);

        if(res != null) {
            System.out.println("arr最大值=" + res);
        } else {
            System.out.println("arr有误，数组不能为null/空");
        }
        
        int index = obj.find(str, "nihao");
        if(index == -1) {
            System.out.println("没找到");
        } else {
            System.out.println("index=" + index);
        }
    }
    
}

class Homework01A {

    // 注意返回类型为Double
    public Double max(double[] arr) {
        // 增强代码健壮性
        if(arr != null && arr.length > 0) {
            double max = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            return null;
        }
        

    }

    public int find(String[] str, String item) {

        if(str != null && str.length > 0) {
            for(int i = 0; i < str.length; i++) {
                if(item.equals(str[i])){
                    return i;
                }
            }
            return -1;
        } else {
            return -1;
        }
        
    }
}
