package lesson7HW;

import lesson7.Student;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задаю значения питомцев
        Pet dog1 = new Pet("Чаппи", 45, 100);
        Pet cat1 = new Pet("Максик", 30, 60);
        Pet cat2 = new Pet("Максик", 30, 60);

        //Выводим все сравнения и данные в консоль
        System.out.println("Питомец N1: Меня зовут " + dog1.getName());
        System.out.println("    Мой вес " + dog1.getWeightKg());
        System.out.println("    Мой рост " + dog1.getHeightCm());

        System.out.println("Питомец N2: Меня зовут " + cat1.getName());
        System.out.println("    Мой вес " + cat1.getWeightKg());
        System.out.println("    Мой рост " + cat1.getHeightCm());

        System.out.println("Питомец N3: Меня зовут " + cat2.getName());
        System.out.println("    Мой вес " + cat2.getWeightKg());
        System.out.println("    Мой рост " + cat2.getHeightCm());

        if (cat1.equals(cat2)) {
            System.out.println(cat1.getName() + " И " + cat2.getName() + " Совпадают ");
        } else {
            System.out.println(cat1.getName() + " И " + cat2.getName() + " Не Совпадают ");
        }

        if (cat1.equals(dog1)) {
            System.out.println(cat1.getName() + " И " + dog1.getName() + " Совпадают ");
        } else {
            System.out.println(cat1.getName() + " И " + dog1.getName() + " Не Совпадают ");
        }

        if (cat2.equals(dog1)) {
            System.out.println(cat2.getName() + " И " + dog1.getName() + " Совпадают ");
        } else {
            System.out.println(cat2.getName() + " И " + dog1.getName() + " Не Совпадают ");
        }
    }
}
