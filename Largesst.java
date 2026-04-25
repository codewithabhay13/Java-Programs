public class Largesst {

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;//-infinity
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        System.out.println("largest value is: "+ getLargest(num));
    }
}
