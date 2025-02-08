package lesson10;

public class Dealer extends Player {

    public Dealer() {
        super("Дилер");
    }

    /**
     * Метод нужны ли еще карты у дилера работает автоматически, если сумма карт в руке меньше 17, то берет карту,
     * если больше 17, то не берет
     * @return true - берет, false - не берет
     */
    @Override
    public boolean doYouNeedMoreCards() {
        return countPointsInHand() < 17;

//То же самое, что и
//        if (countPointsInHand() < 17) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
