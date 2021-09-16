package practice;

public class PrimitiveType {

    public static void main(String[] args) {

        //Double primitive type practice
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        //Float primitive type practice
        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMaxValue);

        //Char primitive type practice
        char charMaxValue = Character.MAX_VALUE;
        System.out.println(charMaxValue);

        char charMinValue = Character.MIN_VALUE;
        System.out.println(charMaxValue);

        //Byte primitive type practice
        byte byteMinValue = Byte.MIN_VALUE;
        System.out.println(byteMinValue);

        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println(byteMaxValue);

        //Short primitive type practice
        short shortMinValue = Short.MIN_VALUE;
        System.out.println(shortMinValue);

        short shortMaxValue = Short.MAX_VALUE;
        System.out.println(shortMaxValue);

        //Long primitive type practice
        long longMinValue = Long.MIN_VALUE;
        System.out.println(longMinValue);

        long longMaxValue = Long.MAX_VALUE;
        System.out.println(longMaxValue);

        //Integer primitive type practice
        int intMinValue = Integer.MIN_VALUE;
        System.out.println(intMinValue);

        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(intMaxValue);

        //Boolean true and false
        boolean isStudent = true;

        printHelloWorld("Privet");
        System.out.println(Integer.compare(4, 5));
        Integer.max(1,2);

        String firstName = "Ivan";
        String lastName = "Petrov";
        System.out.printf("%s %s\n", firstName, lastName);
        String fullName = String.format("%s %s\n", firstName, lastName);
        System.out.println(fullName);

    }

    // Method declaration
    public static void printHelloWorld(String string) {
        System.out.println(string);
        System.out.println("Hello world!");
    }
}
