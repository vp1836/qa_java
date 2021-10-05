package practice.homework.animals;

public class Main {

    public static void main(String[] args) {

        Animal camel = new Animal("Camel", "Andy", 7, Size.BIG, "Beige");

        camel.getAnimalInfo();

        camel.activity(Activity.WALK);
        camel.activity(Activity.PLAY);
        camel.activity(Activity.TRAIN);
        camel.activity(Activity.TRAIN);
        camel.activity(Activity.TRAIN);
        camel.feed();
        camel.sleep(1);
        camel.activity(Activity.PLAY);
        camel.sleep(1);
        camel.wakeUp();
        camel.wakeUp();
    }
}
