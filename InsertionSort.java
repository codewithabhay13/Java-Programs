public class InsertionSort {

    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int current = arr[i]; // element to insert
            int j = i - 1;

            // shift elements to right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place current at correct position
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}