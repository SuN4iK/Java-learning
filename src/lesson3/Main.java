package lesson3;

public class Main {
    public static void main(String[] args) {
        System.out.println("вывести в консоль все числа от 20 до 50, кроме диапазона 30-40");
        //вывести на консоль числа от 20 до 50 кроме от 30 до 40
        for (int number = 20; number < 50; number++) {
            if (number >= 30 || number <= 40) {
                continue;

            }
            System.out.println(number);
        }

        System.out.println();
        System.out.println("в цикле от 0 до 100 прекратить выводить числа, когда сумма выведенных чисел достинет 50");
        //в цикле от 0 до 100 прекратить выводить числа, когда сумма выведенных чисел достинет 50
        int sum = 0;
        for (int number = 0; number < 100; number++) {
            sum += number;
            if (sum > 50) {
                break;
            } else {
                System.out.println(sum);
            }
        }
        System.out.println("Массив с числами от 1 до 10");
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbersArray[0]);
        System.out.println("ЗАмениь первый элемент на число 15");
        numbersArray[0] = 15;
        System.out.println(numbersArray[0]);
        System.out.println("Создадим любой массив и посмотрим его щначения, затем добавим в каждую ячейку значения с увелечением на 2");
        double[] doubleArray = new double[15];
        double value = 0;
        for (int index = 0; index < doubleArray.length; index++) {
            for (int i = 0; i < 2; i++) {
                if (value == 0 && value % 2 == 0) {
                    doubleArray[index] = value;
                }
                value++;

            }

        }
        for (int index = 0; index < doubleArray.length; index++) {
            System.out.println(doubleArray[index]);
        }
        int[] intArrayToReverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = intArrayToReverse.length - 1; index >= 0; index--) {
            System.out.println(intArrayToReverse[index]);
        }

        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int index = 0; index < charArray.length; index++) {
            System.out.println(charArray[index]);
        }
        String helloWorldString = "Hello World!";
        char[] helloWorldArray = helloWorldString.toCharArray();
        for (int index = 0; index < helloWorldArray.length; index++) {
            System.out.println(helloWorldArray[index]);
        }

    }

}
