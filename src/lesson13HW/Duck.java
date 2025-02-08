package lesson13HW;

abstract class Duck implements CanSwim {
    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }
}
