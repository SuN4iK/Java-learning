package lesson9HW2;

public class Rectangle extends Shape {
    public Rectangle(double a, double h) {
        super(a, h);
    }

    @Override
    public double calculateArea() {
        double rectangleArea = (h * a);
        return rectangleArea;
    }
}
