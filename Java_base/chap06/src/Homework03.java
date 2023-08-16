public class Homework03 {
    public static void main(String[] args) {

        int[] oldArr = {10, 30, 50};
        Homework03A obj = new Homework03A();
        int[] newArr = obj.copyArr(oldArr);

        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
    
}

class Homework03A {

    public int[] copyArr(int[] oldArr) {
         
        int[] newArr = new int[oldArr.length];
        for(int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}
