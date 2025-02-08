package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Главный контроллер
 */
public class CheapTripController {
    private CheapTripDB cheapTripDB = new CheapTripDB();

    /**
     * Запускает приложение и выводит меню пользователю
     */
    public void start() {
        System.out.println("Добрый день!");
        System.out.println("Я Марина, ваш проводник в мир путешествий.");

        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    //Обращаемся к Базе Данных и получаем все туры в виде двумерного масссива
                    ArrayList<Tour> allTours = cheapTripDB.getToursDb();
                    //Проходимся циклом
                    for (int index = 0; index < allTours.size(); index++) {
                        //Получаем конкретный тур из каждой ячейки
                        Tour tour = allTours.get(index);
                        //Выводим в консоль
                        System.out.println(tour);
                    }
                    break;

                case 3:
                    String city = UserChoiceScanner.readCityUserCityChoice(scanner);
                    cheapTripDB.printToursByCity(city);
                    break;

                case 4:
                    int priceCategory = UserChoiceScanner.readPriceUserPriceChoice(scanner);
                    cheapTripDB.printToursByPrice(priceCategory);
                    break;

                case 5:
                    int rating = UserChoiceScanner.readStarsUserRatingChoice(scanner);
                    cheapTripDB.printToursByStars(rating);
                    break;

                case 7:
                    return;

                default:
                    System.out.println("Такого я еще не умею, пожалуйста выберите другой вариант");
            }
            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("Добрый день!");
        System.out.println("Я Марина, ваш проводник в мир путешествий.");
        System.out.println("Выберите то, что вы хотите посмотреть: ");
        System.out.println("1 - показать все туры");
        System.out.println("2 - поиск туров по стране");
        System.out.println("3 - поиск туров по городу");
        System.out.println("4 - поиск туров по цене");
        System.out.println("5 - поиск туров по звездам отеля");
        System.out.println("6 - поиск туров по звездам и цене");
        System.out.println("7 - выход");
    }

        }










