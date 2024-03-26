package ru.netology.service;

public class VacationService {
    public int calculateVacations(int income, int expenses, int threshold) {

        int months = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {

            if (money >= threshold) {

                money -= expenses;
                money = money / 3;
                months++;

            } else {
                money -= expenses;
                money += income;
            }
        }
        return months;
    }
}