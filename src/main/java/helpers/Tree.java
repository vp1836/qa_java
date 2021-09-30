package helpers;

public class Tree {

    public static void main(String[] args) {

        int height = 10;
        String star = "*";
        String space = " ";

        for (int i = 0; i < height; i++) {
            //Space
            for (int j = i; j < height; j++) {
                System.out.printf("%s", space);
            }
            //Star
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.printf("%s", star);
            }
            System.out.println();
        }
    }
}
