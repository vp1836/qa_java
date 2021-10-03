package practice.homework.animals;

public enum Size {

    SMALL("Small"),
    AVERAGE("Average"),
    BIG("Big");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}
