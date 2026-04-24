public class Oe {

    public static void OddEven(int n){
        if (n % 2 == 0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int n = 7;
        OddEven(n);
    }
}
