public class Array2 {

    public static void Update(int marks[]){
        //  nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        // int nonChangable = 5;
        Update(marks);
        // System.out.println(nonChangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
