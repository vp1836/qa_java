package practice.homework;

public class GenericPrinter extends PrintBase {

    public <T> void printGeneric(String converter, T[] items) {
        String dataTypeName = ((Object) items[0]).getClass().getName().replace("java.lang.", "");
        System.out.printf("%s%n", dataTypeName);
        for (T item : items) {
            System.out.printf("%" + converter + ", ", item);
        }
        System.out.printf("%n%n");
    }
}
