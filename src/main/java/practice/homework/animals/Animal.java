package practice.homework.animals;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Slf4j
public class Animal {

    public enum Size {
        SMALL, AVERAGE, BIG;
    }
    
    public enum Activity {
        WALK, TRAIN, PLAY;
    }

    private String speciesName;
    private String name;
    private int age;
    private Size size;
    private String color;
    private int energyLevel = 4;
    private boolean isSleeping;
    private int sleepingHours;
    private Activity activity;
    private String lowEnergyWarning = "";

    public Animal() {
    }

    public Animal(String speciesName, String name, int age, Size size) {
        this.speciesName = speciesName;
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public Animal(String speciesName, String name, int age, Size size, String color, boolean isSleeping) {
        this.speciesName = speciesName;
        this.name = name;
        this.age = age;
        this.size = size;
        this.color = color;
        this.isSleeping = isSleeping;
    }

    public void getAnimalInfo() {
        log.info(
                "Animal: {}, Name: {}, Age: {}, Size: {}, Color: {}, is Sleeping: {}, Energy: {}",
                speciesName, name, age, size, color, isSleeping, energyLevel
        );
    }

    public void sleep(int hours) {
        if (isSleeping) {
            log.info("{} {} is sleeping already!", speciesName, name);
        } else if (energyLevel >= 4)  {
            log.info("{} {} don't want to sleep. Energy Level: {}", speciesName, name, energyLevel);
        } else if (hours <= 0) {
            log.info("{} {} can't sleep {} hours! Same Energy Level {}", speciesName, name, hours, energyLevel);
        } else {
            if (hours >= 4) {energyLevel = 4;} else {energyLevel += hours;}
            isSleeping = true;
            sleepingHours = hours;
            log.info("{} {} sleeps for the next {} hour(s)", speciesName, name, sleepingHours);
        }
    }

    public void feed() {
        if (energyLevel >= 4) {
            log.info("{} {} is fed already and don't want to eat. Energy level: {}", speciesName, name, energyLevel);
        } else {
            energyLevel = 4;
            log.info("{} {} is fed. Energy Level: {}", speciesName, name, energyLevel);
        }
    }

    public void wakeUp() {
        if (!isSleeping) {
            log.info("{} {} is awake!", speciesName, name);
        } else {
            isSleeping = false;
            log.info("{} {} wakes up after {} hour(s) of sleep. Energy level: {}", speciesName, name, sleepingHours,
                    energyLevel);
        }
    }

    public void activity(Activity activity) {
        String animalActivity = activity.toString().toLowerCase();
        if (isSleeping) {
            log.info("{} {} sleeps for the next {} hours and can't {}, please do not disturb!", speciesName, name,
                    sleepingHours, animalActivity);
        } else if (energyLevel <= 0) {
            log.info("Warning Low Energy! {} {} should be fed or get some rest.", speciesName, name);
        } else {
            energyLevel--;
            if (energyLevel <= 0) {
                lowEnergyWarning = "Warning! Low ";
            }
            log.info("{} {} {}ed, {}Energy level: {}", speciesName, name, animalActivity, lowEnergyWarning, energyLevel);
        }
    }
}
