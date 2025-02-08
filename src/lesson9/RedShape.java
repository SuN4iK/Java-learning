package lesson9.figures;

public abstract class RedShape {
    private String color = "red";

    public abstract double getArea();

    public abstract String getMyName();

    public String getColor() {
        return color;
    }
}
