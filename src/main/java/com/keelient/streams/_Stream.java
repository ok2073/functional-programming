package com.keelient.streams;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.keelient.streams._Stream.Person.Gender.FEMALE;
import static com.keelient.streams._Stream.Person.Gender.MALE;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        people.stream()
                .map(person -> person.gender)
                .forEach(System.out::println);

        Function<Person, String> name = person -> person.name;
        people.stream()
                .map(person -> person.name)
                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                                        .allMatch(personPredicate);
        System.out.println(containsOnlyFemales);

        containsOnlyFemales = people.stream()
                .anyMatch(personPredicate);
        System.out.println(containsOnlyFemales);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        enum Gender{
            MALE, FEMALE
        }

    }
}
