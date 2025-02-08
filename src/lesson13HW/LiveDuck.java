package lesson13HW;

class LiveDuck extends Duck implements CanQuack, CanFly, CanReproduce {
    @Override
    public void quack() {
        System.out.println("Живая утка крякает");
    }
    @Override
    public void fly() {
        System.out.println("Живая утка летает");
    }

    @Override
    public void reproduce() {
        System.out.println("Живая утка размножается");
    }
}