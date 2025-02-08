package lesson9HW1;

public abstract class Animal {
    protected int age;
    protected double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract void move();

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "возраст:" + age +
                ", вес:" + weight +
                '}';
    }
}
