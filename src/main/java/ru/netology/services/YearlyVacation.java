package ru.netology.services;
public class YearlyVacation {
    public int calculate(int threshold, int monthCount) {
        int income = 10_000;
        int expences = 3_000;
        threshold = 20_000;
        monthCount = 0;
        int money = 0;
        int vacation = 0;

        for (int months = 0; months < 12; months++) {
            if (money >= threshold) {
                monthCount++;
                if (money >= threshold) {
                    vacation = (money - expences) / 3;
                    money = money - vacation;
                }
                money = money - expences - vacation;
            } else {
                money = money + income - expences;
            }
        }
        return monthCount;
    }
}