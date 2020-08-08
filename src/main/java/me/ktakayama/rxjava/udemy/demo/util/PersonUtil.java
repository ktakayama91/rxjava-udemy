package me.ktakayama.rxjava.udemy.demo.util;

import java.util.Arrays;
import java.util.List;

import me.ktakayama.rxjava.udemy.demo.model.Person;

public class PersonUtil {

    public static List<Person> getPersons() {
        Person person1 = Person.builder()
                .name("John")
                .age(30)
                .build();

        Person person2 = Person.builder()
                .name("Richard")
                .age(40)
                .build();

        Person person3 = Person.builder()
                .name("Harry")
                .age(20)
                .build();

        return Arrays.asList(person1, person2, person3);
    }
}
