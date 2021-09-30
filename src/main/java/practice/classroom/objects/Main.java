package practice.classroom.objects;

public class Main {

    public static void main(String[] args) {

        Person john = new Person("John", "Doe", 32, 72.3, true);

        john.retrieveInformation();

        john.setName("Johnny");

        john.retrieveInformation();
        john.setAge(55);
        System.out.println(john.getAge());
        System.out.println(john.toString());
    }
}
