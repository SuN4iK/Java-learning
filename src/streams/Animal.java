abstract class Animal { // Абстрактный класс описывающий животного
    private String nickname; // Кличка животного
    private int age; // Возраст
    private String breed; // Порода
    public Animal(String nickname) { // Конструктор
        this.nickname = nickname;
    }
    /* Перечисляем геттеры и сеттеры... */
    public String getNickname() {
        return nickname;
    }
    //итд...
    abstract void sound(); // Абстрактный метод
    public void run(){ // Обычный метод
        System.out.println(this.nickname+" побежал(а)");
    }
    // итд...
}