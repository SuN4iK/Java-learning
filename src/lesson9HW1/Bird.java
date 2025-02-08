package lesson9HW1;

public class Bird extends Animal{
    public Bird(int age, double weight)  {
        super(age, weight);
    }
    @Override
    public void move() {
        System.out.println("летаю высоко и быстро");
    }

    @Override
    public void eat() {
        System.out.println("ем скромно");
    }
}
