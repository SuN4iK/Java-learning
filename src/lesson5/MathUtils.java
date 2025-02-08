package lesson5;

/**
 * Создание метода
 * <p>
 * 1) Модификаторы доступа (слова определяющие область видимости)
 * <p>
 * public - доступен внутри всего проекта
 * <p>
 * protected - доступен только внутри текущей папки
 * <p>
 * private - доступен только внутри текущего класса
 * <p>
 * 2) Ключевое слово static
 * <p>
 * static - либо есть, либо отсутствует, обозначает статический ли метод или нет
 * <p>
 * Другие параметры метода
 * <p>
 * 3) указываем возвращаемый тип (void - ничего не возвращает, или тип данных int, double, char, String и etc...
 * <p>
 * 4) название метода (toCharArray(), valueOf(), contains() и etc...
 * <p>
 * 5) входящие параметры (Всегда внутри (), если несколько, то через , и с указанием Типа и Названия переменной
 * <p>
 * 6) тело выполнения данного метода, логика метода, всегда внутри {}
 */
public class MathUtils {

    //Задача - создать метод, который посчитает периметр треугольника по 3 сторонам
    //return - не только прерывает выполнение метода, но и возвращает значение

    //Счет периметра треугольника
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        double perimeter = a + b + c;
        return perimeter;
    }
    //Счет периметра квадрата
    public static double calculateSquarePerimeter(double a, double b) {
        double perimeter = (a + b) * 2;
        return perimeter;
    }
    //Счет площади овала
    public static double calculateOvalArea(double a, double b) {
        double perimeter = (a * b) * 3.14;
        return perimeter;
    }
    //Счет площади круга
    public static double calculateCircleArea(double a) {
        double perimeter = (a * a) * 3.14;
        return perimeter;
    }
    //Счет периметра трапеции
    public static double calculateTrapezoidPerimeter(double a, double b, double c, double d) {
        double perimeter = a + b + c + d;
        return perimeter;
    }
}
