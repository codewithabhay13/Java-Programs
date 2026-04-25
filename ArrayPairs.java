public class ArrayPairs {

    // Function to print pairs
    public static void printPairs(int arr[]) {
        // int n = arr.length;
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        printPairs(arr); // function call
    }
}