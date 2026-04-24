public class Product {

    public static int product(int a, int b){
        return a * b;
    }

    public static int fact(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // bionomial cofficient

    public static int bc(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int bincoff = fact_n / (fact_r * fact_nmr);
        return bincoff;

    }
    public static void main(String[] args) {
        // int a = 5;
        // int b = 99;
        // int result = product(a, b);
        // System.out.println(result);
        // int ans = fact(a);
        // System.out.println(ans);
        System.out.println(bc(5, 2));
    }
}
