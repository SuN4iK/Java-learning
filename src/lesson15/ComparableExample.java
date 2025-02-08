package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Боб", 35));
        people.add(new Person("Alice", 56));
        people.add(new Person("Charlie", 20));

        Collections.sort(people);


    }
}
