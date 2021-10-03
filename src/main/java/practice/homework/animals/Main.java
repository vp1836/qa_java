package practice.homework.animals;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog", "Tesla", 2, Size.SMALL);

        Animal camel = new Animal();


        camel.setSpeciesName("Camel");
        camel.setName("Andy");
        camel.setAge(7);
        camel.setSize(Size.BIG);
        camel.setColor("Beige");
        camel.getAnimalInfo();

        camel.activity(Activity.WALK);
        camel.activity(Activity.PLAY);
        camel.activity(Activity.TRAIN);
        camel.activity(Activity.TRAIN);

    }
}
