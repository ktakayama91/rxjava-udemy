package me.ktakayama.rxjava.udemy.demo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.ktakayama.rxjava.udemy.demo.model.Person;

public class RxUtil {

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

    public static List<Integer> getIntegers(int limit) {
        List<Integer> integers = new ArrayList<>();
        for (int i=0; i < limit; i++) {
            integers.add(i);
        }
        return integers;
    }

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
