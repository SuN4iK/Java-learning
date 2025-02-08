package lesson10;

import java.util.Objects;

public class Card {
    private final String type;
    private final int value;

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(type, card.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        return "Карта: " + type + ", номинал: " + value;
    }
    public Card(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

}
