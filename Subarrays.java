public class Subarrays {

    // Function to print all subarrays
    public static void printSubarrays(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        printSubarrays(arr);
    }
}