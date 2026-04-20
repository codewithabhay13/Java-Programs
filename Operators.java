public class Operators {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int s = 10;
        int t = s++;
        System.out.println(s);
        System.out.println(t);

        int h = 10;
        int g = --h;
        System.out.println(h);
        System.out.println(g);

        int y = 10;
        int u = y--;
        System.out.println(y);
        System.out.println(u);

        System.out.println(A == B);
        System.out.println(A != B);
        System.out.println(A > B);
        System.out.println(A < B);
        System.out.println(A >= B);
        System.out.println(A <= B);
        System.out.println((3>2) && (5>0));
        System.out.println((3>2) || (5>0));
        System.out.println(!(3>5));

        int z = 5;
        int q = 10;
        // z = z + 6;
        z+=10;
        q-=7;
        q/=6;
        q%=5;

        System.out.println(z);
        System.out.println(q);

    }
}
