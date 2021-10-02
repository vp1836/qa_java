package practice.homework.animals;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog", "Tesla", 2, Animal.Size.SMALL);
        Animal cat = new Animal("Cat", "Jack", 5, Animal.Size.SMALL);
        Animal horse = new Animal("Horse", "Pie-O-My", 3, Animal.Size.BIG);
        Animal koala = new Animal("Koala", "Sandy", 1, Animal.Size.AVERAGE);
        Animal monkey = new Animal("Monkey", "Coconut", 4, Animal.Size.AVERAGE);
        Animal camel = new Animal();

        camel.setSpeciesName("Camel");
        camel.setName("Andy");
        camel.setAge(7);
        camel.setSize(Animal.Size.BIG);
        camel.setColor("Beige");

        camel.getAnimalInfo();
        camel.activity(Animal.Activity.WALK);
        camel.activity(Animal.Activity.TRAIN);
        camel.activity(Animal.Activity.TRAIN);
        camel.activity(Animal.Activity.PLAY);
        camel.sleep(3);
        camel.activity(Animal.Activity.WALK);
        camel.wakeUp();
    }
}
