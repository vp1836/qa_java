package practice.homework.animals;

public enum Activity {

    WALK("walk"),
    TRAIN("train"),
    PLAY("play");

    private final String description;

    Activity(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}
