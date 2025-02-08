package lesson14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(3, "t");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
    }
}
