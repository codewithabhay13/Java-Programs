public class Avg {

    public static int avg(int a, int b, int c){
        int avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        int a = 44;
        int b = 55;
        int c = 66;

        System.out.println(avg(a, b, c));
    }
}
