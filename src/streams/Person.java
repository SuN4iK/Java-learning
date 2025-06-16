/* Здровье (hp) не может превышать 100 ед. */
public class Person {
    private String name;
    private String lastname;
    private int age;
    private int hp;
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(this.hp+hp > 100) this.hp = 100;
        else this.hp += hp;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }
}