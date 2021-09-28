package practice.classroom;

public class Methods {

    public static void main(String[] args) {

        sum(4, 4);
        System.out.println(returnSum(5, 5));

        int b = returnSum(5, 5);
        System.out.println();
    }

    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public static int returnSum(int a, int b) {
        sum(6, 6);
        return a + b;
    }
}
