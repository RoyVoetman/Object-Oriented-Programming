package nl.hanze.roy.oop.week1.lambda;

import java.util.ArrayList;
import java.util.List;

public class Assignment1 {

    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        listDevs.sort((Developer a, Developer b) -> a.getAge() - b.getAge());

        System.out.println("After Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("Alwin", 33));
        result.add(new Developer("Peter", 24));
        result.add(new Developer("Johan", 26));
        result.add(new Developer("Tanja", 25));

        return result;
    }
}

class Developer {
    String name;
    int age;

    Developer (String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return("name = " + this.name + " age = " + this.age);
    }
}
