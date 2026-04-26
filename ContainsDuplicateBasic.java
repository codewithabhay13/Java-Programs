public class ContainsDuplicateBasic {

    public static boolean containsDuplicate(int nums[]) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true; // duplicate found
                }
            }
        }

        return false; // no duplicate
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}