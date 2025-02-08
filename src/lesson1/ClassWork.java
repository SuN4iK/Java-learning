package lesson1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="ALIcons.Actions.Execute"/> icon in the gutter.
public class ClassWork {
    public static void main(String[] args) {
        //Дано
        int a = 2;
        int b = 1;
        int c = 3;
        //решение
        int perimeter = a + b + c;
        System.out.println(perimeter);

        int tableWidthCm = 180;
        int tableLengthCm = 100;
        int roomWidthCm = 1500;
        int roomLengthCm = 1000;

        int tableArea = tableWidthCm * tableLengthCm;
        int roomArea = roomWidthCm * roomLengthCm;

        double quantityOfTables = (double) roomArea / tableArea;
        System.out.println(" " +
                "Кол-во столов,которое поместиться " + quantityOfTables);
    }
}