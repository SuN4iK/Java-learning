package lesson2;

public class Homework {
    public static void main(String[] args) {
        //1) У нас есть 4 числа. Вывести на консоль самое маленькое из них
        //2) Разместили вклад в банке на сумму 1 млн 200 тыс руб под 22% годовых.
        //          - посчитать доход с капитализацией по итогам года,
        //          - посчитать доход без капитализации по итогам года


        //Задаем числа

        int firstNumber = 356;
        int secondNumber = 567;
        int thirdNumber = 789;
        int fourthNumber = 978;

        //Задаем переменные для второй задачи

        int firstDeposit = 1_200_000;
        double percent = 0.22;
        double totalPercent = firstDeposit * percent;
        double firstDepositOther = 1.2;
        double currentMoneyWeHave = firstDepositOther;


        //Вычисления для первой задачи и вывод
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber && firstNumber <= fourthNumber) {
            System.out.println("Самое маленькое число " + firstNumber);
        } else if (secondNumber <= thirdNumber && secondNumber <= fourthNumber && secondNumber <= firstNumber) {
            System.out.println("Самое маленькое число " + secondNumber);
        } else if (thirdNumber <= fourthNumber && thirdNumber <= secondNumber && thirdNumber <= firstNumber) {
            System.out.println("Самое маленькое число " + thirdNumber);
        } else {
            System.out.println("Самое маленькое число " + fourthNumber);
        }

        //Вычисления для второй задачи без капитализации

        int totalMoneyWithoutCapitalization = (int) (firstDeposit + totalPercent);
        //Вычисления для второй задачи с капитализацией

        for (int day = 1; day < 365; day++) {
            double percentPerDay = currentMoneyWeHave / 100 * 22;
            currentMoneyWeHave += percentPerDay;

        }
        //Вывод второй задачи без капитализации
        System.out.println("Денег, сколько мы получим без капитализации " + totalMoneyWithoutCapitalization);
        //Вывод второй задачи с капитализацией
        System.out.println("Денег, сколько мы получим с капитализацией " + currentMoneyWeHave);

    }
}
