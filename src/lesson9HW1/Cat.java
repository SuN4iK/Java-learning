package lesson9HW1;

public class Cat extends Animal {

    public Cat(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void move() {
        System.out.println("двигаюсь тихо и не заметно");
    }

    @Override
    public void eat() {
        System.out.println("мяу, хозяин корми меня");
    }
}
