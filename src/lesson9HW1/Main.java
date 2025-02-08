package lesson9HW1;

import lesson9HW1.Bird;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(1, 33);
        Cat cat2 = new Cat(2, 2);
        Cat cat3 = new Cat(3, 33);
        Dog dog1 = new Dog(8, 53);
        Dog dog2 = new Dog(5, 33);
        Dog dog3 = new Dog(7, 34);
        Bird bird1 = new Bird(2, 2);
        Bird bird2 = new Bird(3, 3);
        Bird bird3 = new Bird(4, 4);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(bird1);
        animals.add(bird2);
        animals.add(bird3);

        System.out.println("Вот список наших животных: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println("Выведем по отдельности (с помощью цикла фор и) наши движения животных");
        // Вызываем метод move() для каждого животного
        for (Animal animal : animals) {
            animal.move();
        }
    }
}

