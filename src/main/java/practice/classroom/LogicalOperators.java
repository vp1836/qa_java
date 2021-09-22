package practice.classroom;

public class LogicalOperators {

    public static void main(String[] args) {

        //Conditional Statement
        //if

        boolean isStudent = true;
        int x = 2;
        int y = 1;

        //Boolean Variable Expression
        if (!isStudent) {
            System.out.println("Is a student");
        } else {
            System.out.println("Is not a student");
        }

        //Inline Expression
        if (x > y) {
            System.out.println("Yes 1 > 0");
        } else {
            System.out.println("Yes its true");
        }

        //Switch case
        int ukSize = 6;
        int eurSize;

        switch (ukSize) {
            case 6:
                eurSize = 39;
                System.out.println(eurSize);
                break;
            case 7:
                eurSize = 42;
                System.out.println("");
                break;
            default:
                System.out.println("no size");

        }
    }
}