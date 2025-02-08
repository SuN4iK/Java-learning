package lesson2;

public class For {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i += 1) {
            System.out.println("Привет");
        }

        //напечатать на консоль четные числа от 30 до 50
        for (int i = 30; i <= 50; i += 2) {
            System.out.println(i);

        }

        //Напечатать числа от 30 до 300 кратные 3 и 5
        for (int i = 30; i < 300; i++) {
            if(i % 3 == 0 && i % 5 ==0) {
                System.out.println(i);
            }
        }

        //Сколько денег мы вынесем из банка если у нас уже есть 10кк и будем печатать деньги еще пятнадцать дней,
        // таким образом, что сумма будет увеличиваться ежедневно на 13%
        for (int i = 10; i < 15; i *= 0.13);
    }

}
