package lesson5;

public class Main {
    //Напишем программу,которая выводи пользвателю меню с возможностями,пользователь выбирает
    public static void main(String[] args) {
        double result = MathUtils.calculateTrianglePerimeter(1, 2, 3);
        double result2 = MathUtils.calculateSquarePerimeter(1, 2);
        double result3 = MathUtils.calculateOvalArea(1, 2);
        double result4 = MathUtils.calculateCircleArea(1);
        double result5 = MathUtils.calculateTrapezoidPerimeter(1, 2, 3, 4);
    }
}
