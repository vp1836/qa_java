package practice.classroom.objects;

import lombok.*;
import lombok.extern.slf4j.Slf4j;


import java.util.StringJoiner;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Slf4j
public class Person {

    private String name;
    private String surname;
    private int age;
    private double weight;
    private boolean isHetero;

    public void retrieveInformation() {
        log.info("Name: {}, Surname: {}, Age: {}, Weight: {}, Hetero: {}", name, surname, age, weight,
                isHetero);
        System.out.printf("Name: %s, Surname: %s, Age: %d, Weight: %f, Hetero: %s%n", name, surname, age, weight,
                isHetero) ;
    }

    //    @Override
//    public String toString() {
//        return "Name: " + this.name;
//    }
}
