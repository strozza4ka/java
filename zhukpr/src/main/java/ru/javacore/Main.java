package ru.javacore;

public class Main {
    public static   void main(String[] args)
    {
        Tester tester1 = new Tester("Lesha", "Zhuk");
        tester1.printTesterInfo();
        tester1.increaseSalary(10);
        System.out.println("New salary: " + tester1.salary);
        System.out.println("Full name: " + tester1.getFullName());
        System.out.println("Experience in months: " + tester1.getExperienceInMonths());
        System.out.println();
    }
}