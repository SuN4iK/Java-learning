package lesson2;

public class ClassWork {
    public static void main(String[] args) {


        int a = 7;
        int b = 7;
        int c = 7;
        // && и
        // || или
        if (a == b && b == c && c == a) {
            System.out.println("Треугольник равносторонний");
        } else if (a == b || b == c || c == a) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник разнсторонний");
        }


    }
}