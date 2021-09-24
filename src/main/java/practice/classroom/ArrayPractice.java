package practice.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        List<Double> arrayList = new ArrayList<>();

        int j = 0;
        while(j < 5) {
            double random = Math.floor(Math.random()*(10-100+1)+10);
            arrayList.add(random);
            j++;
        }

        System.out.println(arrayList);

        for (double item : arrayList) {
            System.out.printf("%f, ", item);
        }

        String[] arr2 = new String[3];
        arr2[0] = "Nikolay";
        arr2[1] = "Ivan";
        arr2[2] = "Anton";
//        arr2[3] = "John";

        System.out.println(arr.toString());
    }
}
