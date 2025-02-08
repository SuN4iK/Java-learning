package lesson6;

import java.util.ArrayList;

/**
 * База данных
 */
public class CheapTripDB {
    public ArrayList<Tour> toursDb = new ArrayList<>();

    public CheapTripDB() {
        loadToursDb();
    }

    /**
     * Возвращает все туры
     * @return
     */
    public ArrayList<Tour> getToursDb() {
        return toursDb;
    }

    /**
     * Осуществляет загрузку туров в БД
     */
    public void loadToursDb() {
        addTour("Турция", "Стамбул", "Самолет", 5, 100_000, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 7, 150_000, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 10, 150_000, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 5, 70000, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 9, 135000, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 4, 78000, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 5, 80000, 4, "завтрак");
        addTour("Шри-ланка", "Коломбо", "Самолет", 10, 200000, 5, "все включено");
    }

    /**
     * Создает и добавляет тур в БД
     * @param country страна
     * @param city город
     * @param transport транспорт
     * @param days дни
     * @param price цена тура
     * @param stars звезды отеля
     * @param food питание
     */
    public void addTour(String country, String city, String transport, int days, int price, int stars, String food) {
        //Создали тур (представили в виде массива)
        Tour tour = new Tour(country, city, transport, days, price, stars, food);
        //Записали в нее тур
        toursDb.add(tour);
    }




    /**
     * Поиск туров по городу
     * @param city город, по которому нужно вывести туры
     */
    public void printToursByCity(String city) {
        for (int index = 0; index < toursDb.size(); index++) {
            if (toursDb.get(index) != null) {
                Tour tour = toursDb.get(index);
                if (tour.getCity().equals(city)) {
                    System.out.println(tour);
                }
            }
        }
    }

    /**
     * Поиск туров по цене
     * @param price цена, по которой нужно вывести туры (стоят столько же или дешевле)
     */
    public void printToursByPrice(int price) {
        for (int index = 0; index < toursDb.size(); index++) {
            if (toursDb.get(index) != null) {
                Tour tour = toursDb.get(index);
                if (tour.getPrice() <= price) {
                    System.out.println(tour);
                }
            }
        }
    }

    /**
     * Поиск туров по звездам
     * @param stars кол-во звезд отеля, которое соответствует искомому
     */
    public void printToursByStars(int stars) {
        for (int index = 0; index < toursDb.size(); index++) {
            if (toursDb.get(index) != null) {
                Tour tour = toursDb.get(index);
                if (tour.getStars() == stars) {
                    System.out.println(tour);
                }
            }
        }
    }

    /**
     * Поиск туров по звездам и цене
     * @param price цена, соответствующая выбору пользователя
     * @param stars кол-во звезд отеля, которое соответствует искомому
     */
    public void printToursByPriceAndStars(int price, int stars) {
        for (int index = 0; index < toursDb.size(); index++) {
            if (toursDb.get(index) != null) {
                Tour tour = toursDb.get(index);
                if (tour.getPrice() <= price && tour.getStars() == stars) {
                    System.out.println(tour);
                }
            }
        }
    }

}
