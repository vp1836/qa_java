package practice.classroom;

public class LoopSecondPractice {

    public static void main(String[] args) {

        int i = 10;
        while(i >= 0) {
            System.out.printf("%d ", i);
            i--;
        }

        System.out.printf("%n%n");

        boolean isFound = false;
        String[] animals = {"cat", "dog", "panda", "monkey"} ;

        while(!isFound) {
            for (String animal : animals) {
                if(animal.equals("panda"))
                    System.out.println("Found Panda!");
                    isFound = true;
            }
        }

        int[] nums = {30, 20, 40, 10, 55, 5, 45};
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while(j < nums.length) {
            if (max < nums[j]) {
                max = nums[j];
            }
            sum += nums[j];
            j++;
        }
        System.out.println(sum);
        System.out.println(max);

        //Do While
        do {
            System.out.printf("%d ", i);
            i++;
        } while (i <= 10);
    }
}
