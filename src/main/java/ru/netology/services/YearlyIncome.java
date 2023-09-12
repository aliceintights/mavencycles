package ru.netology.services;

import javax.print.attribute.standard.MediaSize;

public class YearlyIncome {
    public int calculate(int income, int expences, int threshold) {
        int money = 0;
        int vacation = 0;

        for (int months = 0; months < 12; months++) {
            if (money >= threshold) {
                vacation++;
                money = (money - expences) / 3;
            } else {
                money = money + income - expences;
            }
        }
        return vacation;
    }
}


