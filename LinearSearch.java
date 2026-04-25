public class LinearSearch {

    public static int linearSearch(int num[], int key){
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5, 6, 8, 9};
        int key = 6;
        int index = linearSearch(nums, key);
        if (index == -1) {
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index: " + index);
        }
    }
}
