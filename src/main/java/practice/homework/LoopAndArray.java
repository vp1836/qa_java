package practice.homework;

import java.util.Arrays;

public class LoopAndArray {

    public static void main(String[] args) {

        //1. Integer Value is 10
        int num = 1;
        if (num == 10) {
            System.out.printf("Integer value is 10%n%n");
        } else {
            System.out.printf("Integer value is NOT 10%n%n");
        }

        //2. Age category discount
        int age = 110;
        if (age >= 18 && age < 21) {
            System.out.printf("Your discount is 10%%%n%n");
        } else if (age >= 21 && age < 65) {
            System.out.printf("Your discount is 15%%%n%n");
        } else if (age >= 65 & age <= 110) {
            System.out.printf("Your discount is 20%%%n%n");
        } else {
            System.out.printf("Incorrect age!%n%n");
        }

        //3. Animals Array
        String[] animals = {
                "Zebra", "Cat", "Dog", "Panda", "Rabbit",
                "Elephant", "Leon", "Parrot", "Snake", "Fox"
        };
        for (String animal : animals){
            if (animal.equals("Elephant")){
                System.out.printf("%s%n%n", animal);
            }
        }

        //4. Fill an Array and get Even Numbers from 0 to 10
        int[] numbers = {};
        for (int i = 0; i <= 10; i++) {
            numbers = Arrays.copyOf(numbers, numbers.length + 1);
            numbers[numbers.length - 1] = i;

            if (i % 2 == 0 && i > 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("%n%n");

        //5. Transport to Work
        int transport = 7;
        switch (transport) {
            case 1:
                System.out.printf("Bus%n%n");
                break;
            case 2:
                System.out.printf("Bicycle%n%n");
                break;
            case 3:
                System.out.printf("Car%n%n");
                break;
            default:
                System.out.printf("Walk%n%n");
        }

        //6. Print numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d ", i);
        }
        System.out.printf("%n%n");

        //7. Print numbers from 50 to 1
        for (int i = 50; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
        System.out.printf("%n%n");

        //8. Multiplication Table
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d ", j * i);
            }
            System.out.printf("%n");
        }
    }
}