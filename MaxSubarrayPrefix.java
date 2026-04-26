public class MaxSubarrayPrefix {

    public static int maxSubarraySum(int arr[]) {
        int n = arr.length;

        // Step 1: create prefix array
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Step 2: check all subarrays using prefix sum
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int currentSum;
                if (i == 0) {
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        System.out.println("Max Sum = " + maxSubarraySum(arr));
    }
}