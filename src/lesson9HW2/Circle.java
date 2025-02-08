package lesson9HW2;

public class Circle extends Shape {
    public Circle(double a, double h) {
        super(a, h);
    }

    @Override
    public double calculateArea() {
        double circleArea = Math.PI * h * h;
        return circleArea;
    }
}
