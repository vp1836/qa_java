package practice.classroom;

public class LoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.printf("%d%n%n", i);
            } else {
                System.out.printf("%d, ", i);
            }
        }

        String[] names = {"John", "Ivan", "Alex", "Anton"};

        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.printf("%s%n%n", names[i]);
            } else if (names[i].equals("Alex")) {
                System.out.printf("Found %s, ", names[i]);
            } else {
                System.out.printf("%s, ", names[i]);
            }
        }

        for (String name : names) {
            System.out.printf("%s, ", name);
        }
        System.out.println();
        System.out.println();

        int[] array = {12, 3, 34, 6, 76, 8, 9, 14, 54};
        printArray(array);

        //Bubble sort 1
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {

                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);

        int[] array2 = {12, 3, 34, 6, 76, 8, 9, 14, 54};
        printArray(array2);

        //Bubble sort 2
        Boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i + 1]) {
                    isSorted = false;

                    int temp = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = temp;
                }
            }
        }
        printArray(array2);

        //Find max number
        int[] array3 = {122, 3, 77, 63, 76, 8, 99, 144, 54};
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > maxNum) {
                maxNum = array3[i];
            }
        }
        System.out.printf("Max number is %d%n", maxNum);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%d%n%n", array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
        }
    }

    public static void printArrayReversed(int[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.println();
        System.out.println();
    }

}
