package ru.netology.services;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        YearlyIncome service = new YearlyIncome();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        System.out.println("vacation");
    }
}

=======
        YearlyVacation service = new YearlyVacation();
        int expected = 3;
        int monthCount = 0;
        int threshold = 0;
        int actual = service.calculate(threshold, monthCount);
        System.out.println(monthCount);
    }
}
>>>>>>> 61c80ef9b4afdda979c276428a725dcd0d0440e6
