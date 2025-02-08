package lesson9HW2;

import lesson9HW1.Animal;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //задаем фигуры
        Triangle triangle1 = new Triangle(4, 5);
        Rectangle rectangle1 = new Rectangle(5, 8);
        Circle circle1 = new Circle(0, 5);

        //создаем лист и добавляем в него фигуры
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(triangle1);
        shapes.add(rectangle1);
        shapes.add(circle1);

        //вывод
        System.out.println("Площадь треугольника1 = " + triangle1.calculateArea());
        System.out.println("Площадь круга1 = " + circle1.calculateArea());
        System.out.println("Площадь прямоугольника1 = " + rectangle1.calculateArea());
    }
}
