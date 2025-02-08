package lesson7;

import java.util.Objects;

public class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private final int yearOfBirth;
    private final String country;
    private String faculty;

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student(String name, int yearOfBirth, String country) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", имя: " + name + '\'' +
                ", годРождения: " + yearOfBirth +
                ", страна: " + country + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return yearOfBirth == student.yearOfBirth && Objects.equals(name, student.name) && Objects.equals(country, student.country) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, country, faculty);
    }
}


