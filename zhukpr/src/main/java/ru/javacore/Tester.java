package ru.javacore;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "С2", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printTesterInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience in years: " + experienceInYears);
        System.out.println("English level: " + englishLevel);
        System.out.println("Salary: " + salary);
    }

    public void increaseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }
    public void increaseSalary(int percentage, int salary) {
        salary = salary + (salary * percentage / 100);
    }

    public void increaseSalary(double percentage, double salary) {
        salary = salary + (salary * percentage / 100);
    }
    public void increaseSalary() {
    }

    public String getFullName() {
        return name + " " + surname;
    }


    public int getExperienceInMonths() {
        return experienceInYears * 12;
    }


}
