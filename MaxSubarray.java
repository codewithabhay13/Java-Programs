public class MaxSubarray {

    public static int maxSubarraySum(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        System.out.println("Max Sum = " + maxSubarraySum(arr));
    }
}