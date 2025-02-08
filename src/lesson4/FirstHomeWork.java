package lesson4;

public class FirstHomeWork {
    public static void main(String[] args) {
        //Задаем массив
        int[][] squareArray = {
                {1, 2, 3, 1, 2, 3},
                {4, 5, 6, 1, 2, 3},
                {7, 8, 9, 1, 2, 3},
                {4, 5, 6, 1, 2, 3},
                {4, 5, 6, 1, 2, 3},
                {4, 5, 6, 1, 2, 3}
        };
        System.out.println("Нужно вывести в консоль числа в массиве слева направо сверху вниз по диагонали");
        //Задаем цикл, который будет проходиться по всем числам массива
        for (int verticalIndex = 0; verticalIndex < squareArray.length; verticalIndex++) {
            int[] nestedArray = squareArray[verticalIndex];
            //Создаем вложенный цикл
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                //Условие вывода и вывод
                if (verticalIndex == horizontalIndex) {
                    System.out.print(squareArray[verticalIndex][horizontalIndex]);
                    //Ложь и вывод
                } else {
                    System.out.print(" ");
                }
            }
            //Перенос на новую строку
            System.out.println();
        }
    }
}
