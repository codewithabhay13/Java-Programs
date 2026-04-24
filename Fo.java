public class Fo {

    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b, float c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3.5f,4.8f, 6.0f));
        System.out.println(sum(3,4));
    }
}
