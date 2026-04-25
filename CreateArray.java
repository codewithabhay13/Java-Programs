import java.util.*;;
public class CreateArray {
    public static void main(String[] args) {
        int marks[] = new int[100];
        // int numbers[] = {1 , 2 , 3};
        // String fruits[] = {"Apple" , "Mango" , "Orange"};
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("ch: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        marks[2] = 100;
        System.out.println(marks[2]);

    }
}
