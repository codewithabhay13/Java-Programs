import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {

        int arr[] = {5, 3, 2, 4, 1};

        Arrays.sort(arr); // sort ho gaya

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}