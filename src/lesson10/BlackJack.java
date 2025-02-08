package lesson10;

import java.util.ArrayList;

public class BlackJack {
    private Deck deck = new Deck();
    private ArrayList<Player> players;

    public BlackJack() {
        //наполняем колоду
        deck.prepareDeck();

        //Подготавливаем список для записи игроков
        players = new ArrayList<>();
    }

    /**
     * Добавить игрока
     * @param player новый игрок
     */
    public void addPlayer(Player player) {
       players.add(player);
    }

    /**
     * Раздать первые 2 карты
     */
    public void dealTwoCardsToAllPlayers() {
        for (int i = 0; i < players.size(); i++) {
           Player player = players.get(i);
           player.addCard(deck.getRandomCard());
           player.addCard(deck.getRandomCard());
        }
    }

    /**
     * Раздать остальные карты
     */
    public void dealRestCardsToAllPlayers() {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            while (player.doYouNeedMoreCards()) {
                player.addCard(deck.getRandomCard());
            }
        }
    }

    /**
     * Найти победителя
     */
    public void findWinner() {
        int maxPoints = 0;
        //Проходим по всем игрокам и ищем максимальное количество очков
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            if (player.isCanWin() && player.countPointsInHand() > maxPoints) {
                maxPoints = player.countPointsInHand();
            }
        }

        //Если maxPoints 0, то есть у всех перебор, то выигра дилер
        if (maxPoints == 0) {
            System.out.println("Победил дилер!");
        } else {
            System.out.println("--------------------");
            //В ином случае определяем победителя по честному
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                if (player.countPointsInHand() == maxPoints) {
                    System.out.println("\nПобедил " + player);
                }
            }
            System.out.println("--------------------");
        }
    }
}
