package lesson13HW;

public class Main {
    public static void main(String[] args) {
        //задаем животных
        LiveDuck liveDuck = new LiveDuck();
        PlushDuck plushDuck = new PlushDuck();
        RubberDuck rubberDuck = new RubberDuck();
        System.out.println("Живая утка:");
        liveDuck.quack();
        liveDuck.swim();
        liveDuck.fly();
        liveDuck.reproduce();
        System.out.println("\nПлюшевая утка:");
        plushDuck.quack();
        plushDuck.swim();
        System.out.println("\nРезиновая утка:");
        rubberDuck.swim();
    }
}