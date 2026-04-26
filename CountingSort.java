public class CountingSort {

    public static void countingSort(int arr[]) {

        int max = arr[0];

        // find max element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // create count array
        int count[] = new int[max + 1];

        // count frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // rebuild sorted array
        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}