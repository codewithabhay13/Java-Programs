public class Pn {

    // public static boolean isPrime(int n){
        
    //     if (n == 2) {
    //         return true;
    //     }
    //     boolean isPrime = true;
    //     for (int i = 2; i < n - 1; i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean isPrime(int n){
        
        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void prims(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(5));
        prims(20);
    }
}
