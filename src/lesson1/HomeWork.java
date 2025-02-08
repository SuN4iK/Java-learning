package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        int moneyWeHave = 1000;
        int snickersPrice = 35;
        int snickersWeBuy = moneyWeHave / snickersPrice;
        System.out.println("Кол-во сникерсов, которое мы купили: " + snickersWeBuy);
        int moneyWeHaveAB = moneyWeHave - (snickersWeBuy * snickersPrice);
        double candyPrice = 3.5;
        int candysWeBuy = (int) (moneyWeHaveAB / candyPrice);
        System.out.println("Кол-во конфет,которое мы купили: " + candysWeBuy);
        double moneyWeHaveAAB = moneyWeHaveAB - (candysWeBuy * candyPrice);
        System.out.println("Сдача: " + moneyWeHaveAAB);
    }
}
