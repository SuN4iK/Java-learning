package lesson7;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ричард", 1987, "США");
        Student student2 = new Student("Добрыня", 2001, "Россия");
        Student student3 = new Student("Ричард", 1987, "США");
        student1.setFaculty("Финансы и кредит");
        student3.setFaculty("Дизайнерство и искусство");

        System.out.println(student1);
        System.out.println(student2);

        //     student1.setName("Натали");

        System.out.println(student1);
        System.out.println(student1.getName());

        System.out.println("Проверяем, одинаковы ли студенты");
        System.out.println(student1.equals(student3));
    }
}
