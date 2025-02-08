package lesson4;

public class Main {
    public static void main(String[] args) {
        //Есть массив цифр 3,5,8,3,55,4,1,65,36,98
        // 1) Вывести на консоль содержимое через ячейку
        // 2) Вывести на консоль массив с обратной стороны (задом наперед)
        // 3) Вывести на консоль те числа, которые содержат символ 5

        int[] intArray = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        System.out.println("Вывести на консоль содержимое через ячейку");
        for (int index = 0; index < intArray.length; index += 2) {
            System.out.println(intArray[index]);
        }

        System.out.println("\nВывести на консоль массив с обратной стороны (задом наперед)");
        for (int index = intArray.length - 1; index >= 0; index--) {
            System.out.println(intArray[index]);
        }

        //String.valueOf() - инструмент, превращает все в строки
        System.out.println("\nВывести на консоль те числа, которые содержат символ 5");
        for (int index = 0; index < intArray.length; index++) {
            int number = intArray[index];
            String value = String.valueOf(number);
            if (value.contains("5")) {
                System.out.println(value);
            }
        }

        System.out.println("\nСоздаем двухмерный массив, сложить туда пару элементов и вывести в консоль");
        int[][] doubleArray = new int[8][6];
        doubleArray[4][2] = 5;
        doubleArray[1][3] = 6;
        doubleArray[4][2] = 8;
        System.out.println(doubleArray[4][2]);

        //\n - отступ на новую строку
        System.out.println("\nСоздать двухмерный массив с элементами и вывести все в консоль");
        int[][] doubleArray2 = {
                {1, 5, 7, 3}, //уровень 0
                {5, 4, 3}, //уровень 1
                {1, 5, 7, 7, 6}  //уровень 2
        };

        //Верхний цикл проходится по ячейкам массива doubleArray2, которые внутри себя содержат другие массивы
        for (int verticalIndex = 0; verticalIndex < doubleArray2.length; verticalIndex++) {
            //Получив массив из ячейки, пишем его в переменную nestedArray
            int[] nestedArray = doubleArray2[verticalIndex];
            //Запускаем новый цикл, который проходит по всем элементам nestedArray
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                //Получаем каждый элемент nestedArray по индексу и пишем в переменную number
                int number = nestedArray[horizontalIndex];
                //Выводим ее в консоль
                System.out.println(number);
            }
        }

        // ln в println - это то же самое, что \n - перенос строки
        System.out.println("\nСоздать квадратный массив (одинаково элементов по вертикали и горизонтали) " +
                "и вывести в консоль по диагонали справа налево сверху вниз");
        int[][] squareArray = {
                {1, 2, 3, 1, 2, 3},
                {4, 5, 6, 1, 2, 3},
                {7, 8, 9, 1, 2, 3},
                {4, 5, 6, 1, 2, 3},
                {4, 5, 6, 1, 2, 3},
                {4, 5, 6, 1, 2, 3}
        };
        for (int verticalIndex = 0; verticalIndex < squareArray.length; verticalIndex++) {
            int[] nestedArray = squareArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex + horizontalIndex == squareArray.length) {
                    System.out.print(squareArray[verticalIndex][horizontalIndex]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Необходимо вывести тот же массив в виде шахматной доски");
        for (int verticalIndex = 0; verticalIndex < squareArray.length; verticalIndex++) {
            int[] nestedArray = squareArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if ((verticalIndex + horizontalIndex) % 2 != 0) {
                    System.out.print(squareArray[verticalIndex][horizontalIndex]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Домашнее задание
        //Скопировать squareArray
        //вывести Диагональ сверху вниз слева направо
        //Вывести только левую половину массива
    }
}
