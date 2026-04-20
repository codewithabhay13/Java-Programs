import java.util.Scanner;

public class NumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int sum = 0;
        while (count <= num) {
            // System.out.println(count);
            sum = sum + count;
            count++;
            // System.out.println(sum);
        }
        System.out.println(sum);
    }
}
