package lesson9HW2;

public abstract class Shape {
    //переменные
    protected double a;
    protected double h;

    public Shape(double a, double h) {
        this.h = h;
        this.a = a;
    }

    //метод счета площади
    public abstract double calculateArea();

    //Оверрайд
    @Override
    public String toString() {
        return "Shape{" +
                "сторона: " + a +
                " проведенная к ней высота, для круга радиус " + h +
                '}';
    }
}
