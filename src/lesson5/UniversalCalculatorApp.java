package lesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Напишем программу, которая выводит пользователю меню с возможностями, пользователь выбирает нужную функцию
// и она запускается и выполняет свою логику
public class UniversalCalculatorApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            //Выбор
            System.out.println("Выберите фигуру:");
            System.out.println("1 - треугольник, посчитаю периметр");
            System.out.println("2 - квадрат, посчитаю периметр");
            System.out.println("3 - овал, посчитаю площадь");
            System.out.println("4 - круг, посчитаю площадь");
            System.out.println("5 - трапеция, посчитаю периметр");
            System.out.println("6 - выход");

            Scanner sc = new Scanner(System.in); //System.in - это режим работы сканера на чтение ввода с клавиатуры
            int userChoice = sc.nextInt(); //nextInt() - дай следующее значение, ожидаю там int и записываю в userChoice

            //В зависимости от выбора пользователя выполняем ту или иную логику
            if (userChoice == 1) {
            //Треугольник
                System.out.println("Введите сторону a: ");
                double a = sc.nextDouble();

                System.out.println("Введите сторону b: ");
                double b = sc.nextDouble();

                System.out.println("Введите сторону c: ");
                double c = sc.nextDouble();

                double result = MathUtils.calculateTrianglePerimeter(a, b, c);
                System.out.println("Периметр треугольника равен: " + result);
            //Квадрат
            } else if (userChoice == 2) {
                System.out.println("Введите сторону a: ");
                double a = sc.nextDouble();

                System.out.println("Введите сторону b: ");
                double b = sc.nextDouble();

                double result = MathUtils.calculateSquarePerimeter(a, b);
                System.out.println("Периметр квадрата равен: " + result);
            //Овал
            } else if (userChoice == 3) {
                System.out.println("Введите радиус a: ");
                double a = sc.nextDouble();

                System.out.println("Введите радиус b: ");
                double b = sc.nextDouble();

                double result = MathUtils.calculateOvalArea(a, b);
                System.out.println("Площадь Овала равна: " + result);
            //Круг
            } else if (userChoice == 4) {
                System.out.println("Введите радиус a: ");
                double a = sc.nextDouble();

                double result = MathUtils.calculateCircleArea(a);
                System.out.println("Площадь Круга равна: " + result);
            //Трапеция
            } else if (userChoice == 5) {
                System.out.println("Введите сторону a ");
                double a = sc.nextDouble();

                System.out.println("Введите сторону b ");
                double b = sc.nextDouble();

                System.out.println("Введите сторону c");
                double c = sc.nextDouble();

                System.out.println("Введите сторону d");
                double d = sc.nextDouble();

                double result = MathUtils.calculateTrapezoidPerimeter(a, b, c, d);
                System.out.println("Периметр трапеции равен: " + result);
            //Выход
            } else if (userChoice == 6) {
                return;
            }
            System.out.println();
        }

    }
}
