package lesson10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    private final String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Добавить карту в руку
     * @param card новая карта
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * Спрашивает игрока нужны ли ему карты и отдает ответ игре
     * @return true - если карты нужны, false - если карты не нужны
     */
    public boolean doYouNeedMoreCards() {
        System.out.println("\n" + name + ", Ваши карты: ");
        openHand();

        if (isCanWin()) {
            //Если игрок еще может выиграть, то спрашиваем нужна ли еще карта
            System.out.println("\nВам нужна еще одна карта?");

            //Считываем ответ игрока
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("да")) {
                return true;
            } else {
                return false;
            }
        } else {
            //Если игрок уже перебрал более 21 очка, тогда сообщаем ему об этом и больше не спрашиваем карты
            System.out.println("К сожалению, у вас перебор очков");
            return false;
        }
    }

    /**
     * Может ли игрок выиграть
     * @return true - может, false - не может
     */
    public boolean isCanWin() {
        return countPointsInHand() <= 21;
    }

    public int countPointsInHand() {
        int totalPoints = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            totalPoints += card.getValue();
        }
        return totalPoints;
    }

    /**
     * Открыть руку
     */
    private void openHand() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Игрок " + name;
    }
}
