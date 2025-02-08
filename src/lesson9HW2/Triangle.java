package lesson9HW2;

public class Triangle extends Shape {
    public Triangle(double a, double h) {
        super(a, h);
    }

    @Override
    public double calculateArea() {
        double triangleArea = (h * a) / 2;
        return triangleArea;
    }


}

