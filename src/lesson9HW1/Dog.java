package lesson9HW1;

public class Dog extends Animal {

    public Dog(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void move() {
        System.out.println("громко скачу и лаю");
    }

    @Override
    public void eat() {
        System.out.println("Так вкусно ем, что летит во все стороны");
    }
}
