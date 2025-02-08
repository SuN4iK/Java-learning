package lesson3;

public class SecondHomework {
    public static void main(String[] args) {
        //задаем переменные
        char[] firstWordsChar = {'Я'};
        String secondWordsString = "Java";
        String thirdWordsString = "Разработчик";

        //превращаем строки в символы
        char[] secondWordsArray = secondWordsString.toCharArray();
        char[] thirdWordsArray = thirdWordsString.toCharArray();

        //создаем цикл для разворота 3 предложения и выводим в консоль
        for (int i = thirdWordsArray.length - 1; i >= 0; i--) {
            System.out.print(thirdWordsArray[i]);
        }

        //пробел
        System.out.print(" ");

        //создаем цикл для разворота 2 предложения и выводим в консоль
        for (int i = secondWordsArray.length - 1; i >= 0; i--) {
            System.out.print(secondWordsArray[i]);
        }

        //пробел
        System.out.print(" ");

        //выводим в консоль первый символ
        System.out.println(firstWordsChar);


    }
}
