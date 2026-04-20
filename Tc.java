public class Tc {
    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b);

        long n = 88;
        int m = (int)n;
        System.out.println(m);

        char aa = 'a';
        char bb = 'b';
        System.out.println((int)aa);
        System.out.println((int)bb);
        System.out.println(bb - aa);

        short aaa = 5;
        byte bbb = 25;
        char ccc = 'c';
        byte bt = (byte)(aaa + bbb + ccc);

        int v = 10;
        float h = 20.88f;
        long p = 77;
        double i = 87;
        double ans = v + h + p + i;
        System.out.println(ans);
    }
}
