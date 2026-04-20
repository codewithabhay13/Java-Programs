public class Ternary {
    public static void main(String[] args) {
        int num = 4;
        int marks = 78;
        String status = marks >= 33 ? "pass" : "fail";
        System.out.println(status);
        String type = (num % 2 ==0) ? "even" : "odd";
        System.out.println(type);
    }
}
