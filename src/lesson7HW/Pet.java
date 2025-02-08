package lesson7HW;

import java.io.InputStream;
import java.util.Objects;

//Конструктор
public class Pet {
    private final String name;
    private final String color = "";
    private final int quantityOfPaw = 0;
    private int weightKg;
    private int heightCm;
    private String loveFood;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getQuantityOfPaw() {
        return quantityOfPaw;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public String getLoveFood() {
        return loveFood;
    }

    public void setLoveFood(String loveFood) {
        this.loveFood = loveFood;
    }

    public Pet(String name, int weightKg, int heightCm) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
    }

    //Оверрайд
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pets = (Pet) o;
        return color == pets.color && weightKg == pets.weightKg && quantityOfPaw == pets.quantityOfPaw && heightCm ==
                pets.heightCm && Objects.equals(name, pets.name) && Objects.equals(loveFood, pets.loveFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weightKg, quantityOfPaw, heightCm, loveFood);
    }

    @Override
    public String toString() {
        return "Pets{" +
                "имя: '" + name + '\'' +
                ",цвет: '" + color +
                ",вес: '" + weightKg +
                ",кол-во лап: '" + quantityOfPaw +
                ",рост: '" + heightCm +
                ",любимая еда: '" + loveFood + '\'' +
                '}';
    }
}
