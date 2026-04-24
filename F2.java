import java.util.Scanner;

public class F2 {

    public static int sum(int a, int b)  { // formalparameters or parameters
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a, b); // actual parameters or arguments 
        System.out.println(result);
    }
}
