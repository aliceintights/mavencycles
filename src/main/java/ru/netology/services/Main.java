package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        YearlyVacation service = new YearlyVacation();
        int expected = 3;
        int monthCount = 0;
        int threshold = 0;
        int actual = service.calculate(threshold, monthCount);
        System.out.println(monthCount);
    }
}