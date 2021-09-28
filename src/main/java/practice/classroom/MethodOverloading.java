package practice.classroom;

public class MethodOverloading {

    public static void main(String[] args) {

        printInfo("Vajsa");
        System.out.println(printInfo("Vajsa ", "Pupkin"));


    }

    public static void printInfo(String name) {
        System.out.println(name);
    }

    public static String printInfo(String name, String surname) {
        return name + surname;
    }
}
