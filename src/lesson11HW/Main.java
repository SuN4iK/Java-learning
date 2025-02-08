package lesson11HW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //первое задание
        System.out.println("1 задание: \n int x = 10    примитивный \n String str = \"Hello\"   ссылочный   \n" +
                " boolean isTrue = true    примитивный \n double d = 3.14  примитивный \n" +
                " Integer i = new Integer(20)   ссылоччный \n ArrayList<Integer> list = new ArrayList<>()   ссылочный \n" +
                " char c = 'a'    примитивный \n float f = 2.718f     примитивный");
        //второе задание
        System.out.println("\n2 задание:");
        //1
        int int1 = 10;
        String string1 = String.valueOf(int1);
        System.out.println(" Преобразованный int: " + string1);
        //2
        String string2 = "12345";
        int int2 = Integer.parseInt(string2);
        System.out.println(" \n Преобразованная строка: " + int2);
        //3
        double double1 = 30.5;
        int int3 = (int) double1;
        System.out.println(" \n Преобразованный double: " + int3);
        //4
        int[] int4 = {1, 3, 4, 5};
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < int4.length; i++) {
            arrayList1.add(int4[i]);
        }
        System.out.println(" \n Преобразованный масив: " + arrayList1);
        //третье задание
        System.out.println("\n3 задание");
        // Создание с помощью конструктора
        Integer integer1 = new Integer(10);
        System.out.println(" Integer создан с помощью конструктора: " + integer1);
        // Создание с помощью метода valueOf()
        Integer integer2 = Integer.valueOf(20);
        System.out.println("\n Integer создан с помощью valueOf(): " + integer2);
        // Сравнение
        boolean isEqual = integer1.equals(integer2);
        System.out.println("\n integer1 и integer2 равны: " + isEqual);
        // Применить метод parseInt() для преобразования строки в целое число
        String string3 = "30";
        int int5 = Integer.parseInt(string3);
        System.out.println(" \n  Преобразованная строка в целое число: " + int5);
    }
}
