package org.javafunctionalprogramming.imperativedeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@SpringBootApplication
public class ImperativeDeclarativeClass {
    public static void main(String[] args) {
        //SpringApplication.run(MainClass.class,args);
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Ana", Gender.FEMALE),
                new Person("Marko", Gender.MALE),
                new Person("James", Gender.MALE)
        );
        // Imperative approach
        // How much female we have
        System.out.println("Imperative approach !");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        int femaleSize = females.size();
        System.out.println("We have : " + femaleSize + " females !");
        for (Person female : females) {
            System.out.println("Her name is : " + female);
        }
        System.out.println("");
        //Declarative approach
        System.out.println("Declarative approach !");
        //Just print
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).forEach(System.out::println);
        // Collect in new list
        List<Person>females2 = people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).collect(Collectors.toList());
        //Print from new List
        System.out.println("");
        System.out.println("Print from new List !");
        females2.stream().filter(person -> Gender.FEMALE.equals(person.gender)).forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
