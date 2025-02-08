package lesson6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserChoiceScanner {

    public static String readCountryUserChoice(Scanner scanner) {
        System.out.println("Введите страну, куда Вы хотите поехать");
        //Вызываем nextLine для переноса курсора сканера на новую строку
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static String readCityUserCityChoice(Scanner scanner) {
        System.out.println("Введите город, куда Вы хотите поехать");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static int readPriceUserPriceChoice(Scanner scanner) {
        System.out.println("Введите Ваш предполагаемый бюджет на тур");
        scanner.nextLine();
        return scanner.nextInt();
    }

    public static int readStarsUserRatingChoice(Scanner scanner) {
        System.out.println("Введите желаемое кол-во звезд рейтинга отеля");
        scanner.nextLine();
        return scanner.nextInt();
    }
}
