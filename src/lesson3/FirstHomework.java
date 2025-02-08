package lesson3;

public class FirstHomework {
    public static void main(String[] args) {

        //создаем массив с числами
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30};

        // создаем цикл
        for (int i = 0; i < numbers.length; i++) {

            //проверка на условия задачи
            if (numbers[i] % 2 == 1 || numbers[i] == 6 || numbers[i] == 10 || numbers[i] == 14) {

                //пропуск чисел, которые не соответствуют условию задачи
                continue;

                //ложь
            } else {
                System.out.println(numbers[i]);
            }


        }

    }
}





