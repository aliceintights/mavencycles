package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        YearlyIncome service = new YearlyIncome();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        System.out.println("vacation");
    }
}

