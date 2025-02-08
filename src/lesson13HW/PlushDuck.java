package lesson13HW;

class PlushDuck extends Duck implements CanQuack {
    @Override
    public void quack() {
        System.out.println("Плюшевая утка пищит");
    }
}