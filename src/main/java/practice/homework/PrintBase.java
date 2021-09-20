package practice.homework;

public class PrintBase {

    //Print double data method (double Args)
    public static void printData(String format, double d1, double d2, double d3, double d4, double d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }

    //Overloading printData method (float Args)
    public static void printData(String format, float d1, float d2, float d3, float d4, float d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }

    //Overloading printData method (long Args)
    public static void printData(String format, long d1, long d2, long d3, long d4, long d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }

    //Overloading printData method (int Args)
    public static void printData(String format, int d1, int d2, int d3, int d4, int d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }

    //Overloading printData method (char Args)
    public static void printData(String format, char d1, char d2, char d3, char d4, char d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }

    //Overloading printData method (short Args)
    public static void printData(String format, short d1, short d2, short d3, short d4, short d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }

    //Overloading printData method (byte Args)
    public static void printData(String format, byte d1, byte d2, byte d3, byte d4, byte d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }

    //Overloading printData method (boolean Args)
    public static void printData(String format, boolean d1, boolean d2, boolean d3, boolean d4, boolean d5) {
        String dataTypeName = ((Object) d1).getClass().getName().replace("java.lang.", "");
        System.out.printf(
                dataTypeName + ": %" + format + ", %" + format + ", %" + format + ", %" + format + ", %" + format + "%n%n",
                d1, d2, d3, d4, d5
        );
    }
}
