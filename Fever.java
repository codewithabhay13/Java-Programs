public class Fever {
    public static void main(String[] args) {
        float temp = 104.9f;
        if (temp > 100) {
            System.out.println("fever is too high call the doctor");
        }
        else if (temp > 80 && temp > 100) {
            System.out.println("fever is medium take rest");
        }
        else{
            System.out.println("no fever");
        }
    }
}
