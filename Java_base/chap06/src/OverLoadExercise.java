public class OverLoadExercise {
    public static void main(String[] args) {

        Methods met = new Methods();
        met.m(5);
        met.m(4, 5);
        met.m("hello!");

        System.out.println("max=" + met.max(9, 40));
        System.out.println("max=" + met.max(47.5, 85.6));
        System.out.println("max=" + met.max(85.1, 878, 87.6));
        
    }
}

class Methods {

    public void m(int n) {
        System.out.println("n^2=" + n * n);
    }
    public void m(int n1, int n2) {
        System.out.println("n1 * n2=" + n1 * n2);
    }
    public void m(String str) {
        System.out.println(str);
    }

    public int max(int n1, int n2) {
        if(n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public double max(double n1, double n2) {
        if(n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public double max(double n1, double n2, double n3) {

        double tmp;
        tmp = n1 > n2 ? n1 : n2;
        return tmp > n3 ? tmp : n3; 
    }
}
