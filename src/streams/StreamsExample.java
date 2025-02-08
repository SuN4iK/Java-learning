package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, 2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);

        ArrayList<String> Lands = new ArrayList<>();
        Collections.addAll(Lands, "Kazan", "Moscow", "Petersburg");
        Lands.stream().filter(s -> s.length() == 5).forEach(a -> System.out.println(a));

        String[] cities = {"Kazan", "Moscow", "Petersburg"};
        Stream<String> citiesOfStream = Stream.of(cities);
        citiesOfStream.forEach(s -> System.out.println(s));

        Stream<Phone> phoneStream = Stream.of(new Phone("Samsung galaxy s3", 20000),
                new Phone("Samsung galaxy s3", 20000), new Phone("Samsung galaxy s3", 20000));





    }
}


class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}