package lesson10;

public class Main {
    public static void main(String[] args) {
        System.out.println("блаблабла");
        //Создаем игроков
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        Player player3 = new Player("Ричард");
        Player player4 = new Player("Наташа");
        Dealer dealer = new Dealer();

        //Стартуем игру
        BlackJack blackJack = new BlackJack();

        //Добавляем всех желающих
        blackJack.addPlayer(player1);
        blackJack.addPlayer(player2);
        blackJack.addPlayer(player3);
        blackJack.addPlayer(player4);
        blackJack.addPlayer(dealer);

        //Раздаем всем по 2 карты
        blackJack.dealTwoCardsToAllPlayers();

        //Раздаем остальные карты
        blackJack.dealRestCardsToAllPlayers();

        //Ищем победителя
        blackJack.findWinner();
    }
}

