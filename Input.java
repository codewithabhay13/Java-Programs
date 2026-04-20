import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  input = sc.nextLine();
        System.out.println(input);

        int num = sc.nextInt();
        System.out.println(num);

        float price = sc.nextFloat();
        System.out.println(price);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int mul = num1 * num2;
        System.out.println(sum);
        System.out.println(mul);

        double r = sc.nextDouble();

        double area = 3.14 * r * r;
        System.out.println(area);


        
    }
}
